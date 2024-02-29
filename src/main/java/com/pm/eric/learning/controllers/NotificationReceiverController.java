package com.pm.eric.learning.controllers;

import com.pm.eric.learning.mappers.NotificationReceiverVOMapper;
import com.pm.eric.learning.models.dto.NotificationReceiverDTO;
import com.pm.eric.learning.models.entity.NotificationReceiver;
import com.pm.eric.learning.services.NotificationReceiverService;
import com.pm.eric.learning.vo.notification_receiver.NotificationReceiverCreateRequestVO;
import com.pm.eric.learning.vo.notification_receiver.NotificationReceiverCreateResponseVO;
import com.pm.eric.learning.vo.notification_receiver.NotificationReceiverResponseVO;
import com.pm.eric.learning.vo.notification_receiver.NotificationReceiverUpdateRequestVO;
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

@Tag(name = "Notification Receiver")
@RestController
@RequestMapping("/v1/notification-receiver")
public class NotificationReceiverController {
    @Autowired
    private NotificationReceiverService notificationReceiverService;
    @Autowired
    private NotificationReceiverVOMapper notificationReceiverVOMapper;

    @Operation(summary = "Create notification receiver")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(mediaType = "application/json",schema = @Schema(implementation = NotificationReceiverCreateResponseVO.class))
            ),
    })
    @PostMapping
    public ResponseEntity<NotificationReceiverCreateResponseVO> create(@RequestBody NotificationReceiverCreateRequestVO notificationReceiverCreateRequestVO){
        NotificationReceiverDTO notificationReceiverDTO = notificationReceiverVOMapper.from(notificationReceiverCreateRequestVO);
        NotificationReceiver notificationReceiver = notificationReceiverService.create(notificationReceiverDTO);
        NotificationReceiverCreateResponseVO vo = notificationReceiverVOMapper.toNotificationReceiverCreateResponse(notificationReceiver);
        return new ResponseEntity<>(vo, HttpStatus.CREATED);
    }

    @Operation(summary = "Get notification receiver by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(mediaType = "application/json",schema = @Schema(implementation = NotificationReceiverResponseVO.class))
            ),
    })
    @GetMapping("{id}")
    public ResponseEntity<NotificationReceiverResponseVO> get(@PathVariable Long id){
        NotificationReceiver notification = notificationReceiverService.get(id);
        NotificationReceiverResponseVO vo = notificationReceiverVOMapper.toNotificationReceiverResponse(notification);
        return new ResponseEntity<>(vo, HttpStatus.FOUND);
    }

    @Operation(summary = "Get all notification receiver")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(mediaType = "application/json",array = @ArraySchema(schema = @Schema(implementation = NotificationReceiverResponseVO.class)))
            ),
    })
    @GetMapping
    public ResponseEntity<List<NotificationReceiverResponseVO>> getList(){
        List<NotificationReceiver> notificationReceiverList = notificationReceiverService.getList();
        List<NotificationReceiverResponseVO> voList = notificationReceiverVOMapper.toNotificationReceiverListResponse(notificationReceiverList);
        return new ResponseEntity<>(voList, HttpStatus.OK);
    }
    @Operation(summary = "Update notification receiver by ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation",
                    content = @Content(mediaType = "application/json",schema = @Schema(implementation = NotificationReceiverResponseVO.class))
            ),
    })
    @PatchMapping("{id}")
    public ResponseEntity<NotificationReceiverResponseVO> update(@PathVariable Long id, @RequestBody NotificationReceiverUpdateRequestVO notificationReceiverUpdateRequestVO){
        NotificationReceiverDTO notificationReceiverDTO = notificationReceiverVOMapper.fromUpdate(notificationReceiverUpdateRequestVO);
        NotificationReceiver notification = notificationReceiverService.update(id,notificationReceiverDTO);
        NotificationReceiverResponseVO vo = notificationReceiverVOMapper.toNotificationReceiverResponse(notification);
        return new ResponseEntity<>(vo,HttpStatus.OK);
    }
    @Operation(summary = "Delete notification receiver by ID")
    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        String res = notificationReceiverService.delete(id);
        return new ResponseEntity<>(res,HttpStatus.OK);
    }
}
