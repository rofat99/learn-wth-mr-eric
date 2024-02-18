package com.pm.eric.learning.notification.controllers;

import com.pm.eric.learning.notification.mappers.NotificationVOMapper;
import com.pm.eric.learning.notification.models.dto.NotificationDTO;
import com.pm.eric.learning.notification.models.entity.Notification;
import com.pm.eric.learning.notification.services.NotificationService;
import com.pm.eric.learning.notification.vo.notification.NotificationCreateRequestVO;
import com.pm.eric.learning.notification.vo.notification.NotificationCreateResponseVO;
import com.pm.eric.learning.notification.vo.notification.NotificationResponseVO;
import com.pm.eric.learning.notification.vo.notification.NotificationUpdateRequestVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Notification")
@RestController
@RequestMapping("/v1/notification")
public class NotificationController {
    @Autowired
    private NotificationService notificationService;
    @Autowired
    private NotificationVOMapper notificationVOMapper;

    @Operation(summary = "Create notification")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(mediaType = "application/json",schema = @Schema(implementation = NotificationCreateResponseVO.class))
            ),
    })
    @PostMapping
    public ResponseEntity<NotificationCreateResponseVO> create(@RequestBody NotificationCreateRequestVO notificationCreateRequestVO){
        NotificationDTO notificationDTO = notificationVOMapper.from(notificationCreateRequestVO);
        Notification notification = notificationService.create(notificationDTO);
        NotificationCreateResponseVO vo = notificationVOMapper.toNotificationCreateResponse(notification);
        return new ResponseEntity<>(vo, HttpStatus.CREATED);
    }

    @Operation(summary = "Get notification by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(mediaType = "application/json",schema = @Schema(implementation = NotificationResponseVO.class))
            ),
    })
    @GetMapping("{id}")
    public ResponseEntity<NotificationResponseVO> get(@PathVariable Long id){
        Notification notification = notificationService.get(id);
        NotificationResponseVO vo = notificationVOMapper.toNotificationResponse(notification);
        return new ResponseEntity<>(vo, HttpStatus.FOUND);
    }

    @Operation(summary = "Get all notification")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(mediaType = "application/json",array = @ArraySchema(schema = @Schema(implementation = NotificationResponseVO.class)))
            ),
    })
    @GetMapping
    public ResponseEntity<List<NotificationResponseVO>> getList(){
        List<Notification> notificationList = notificationService.getList();
        List<NotificationResponseVO> voList = notificationVOMapper.toNotificationResponse(notificationList);
        return new ResponseEntity<>(voList, HttpStatus.OK);
    }
    @Operation(summary = "Update notification by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(mediaType = "application/json",schema = @Schema(implementation = NotificationResponseVO.class))
            ),
    })
    @PatchMapping("{id}")
    public ResponseEntity<NotificationResponseVO> update(@PathVariable Long id, @RequestBody NotificationUpdateRequestVO notificationUpdateRequestVO){
        NotificationDTO notificationDTO = notificationVOMapper.fromUpdate(notificationUpdateRequestVO);
        Notification notification = notificationService.update(id,notificationDTO);
        NotificationResponseVO vo = notificationVOMapper.toNotificationResponse(notification);
        return new ResponseEntity<>(vo,HttpStatus.OK);
    }
    @Operation(summary = "Delete notification by ID")
    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        String res = notificationService.delete(id);
        return new ResponseEntity<>(res,HttpStatus.OK);
    }
}
