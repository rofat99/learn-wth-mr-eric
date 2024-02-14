package com.pm.eric.learning.notification.controllers;

import com.pm.eric.learning.notification.mappers.NotificationReceiverVOMapper;
import com.pm.eric.learning.notification.models.dto.NotificationReceiverDTO;
import com.pm.eric.learning.notification.models.entity.NotificationReceiver;
import com.pm.eric.learning.notification.services.NotificationReceiverService;
import com.pm.eric.learning.notification.vo.notification_receiver.NotificationReceiverCreateRequestVO;
import com.pm.eric.learning.notification.vo.notification_receiver.NotificationReceiverCreateResponseVO;
import com.pm.eric.learning.notification.vo.notification_receiver.NotificationReceiverResponseVO;
import com.pm.eric.learning.notification.vo.notification_receiver.NotificationReceiverUpdateRequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NotificationReceiverController {
    @Autowired
    private NotificationReceiverService notificationReceiverService;
    @Autowired
    private NotificationReceiverVOMapper notificationReceiverVOMapper;

    @PostMapping
    public ResponseEntity<NotificationReceiverCreateResponseVO> create(@RequestBody NotificationReceiverCreateRequestVO notificationReceiverCreateRequestVO){
        NotificationReceiverDTO notificationReceiverDTO = notificationReceiverVOMapper.from(notificationReceiverCreateRequestVO);
        NotificationReceiver notificationReceiver = notificationReceiverService.create(notificationReceiverDTO);
        NotificationReceiverCreateResponseVO vo = notificationReceiverVOMapper.toNotificationReceiverCreateResponse(notificationReceiver);
        return new ResponseEntity<>(vo, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<NotificationReceiverResponseVO> get(@PathVariable Long id){
        NotificationReceiver notification = notificationReceiverService.get(id);
        NotificationReceiverResponseVO vo = notificationReceiverVOMapper.toNotificationReceiverResponse(notification);
        return new ResponseEntity<>(vo, HttpStatus.FOUND);
    }

    @GetMapping
    public ResponseEntity<List<NotificationReceiverResponseVO>> getList(){
        List<NotificationReceiver> notificationReceiverList = notificationReceiverService.getList();
        List<NotificationReceiverResponseVO> voList = notificationReceiverVOMapper.toNotificationReceiverListResponse(notificationReceiverList);
        return new ResponseEntity<>(voList, HttpStatus.OK);
    }
    @PatchMapping("{id}")
    public ResponseEntity<NotificationReceiverResponseVO> update(@PathVariable Long id, @RequestBody NotificationReceiverUpdateRequestVO notificationReceiverUpdateRequestVO){
        NotificationReceiverDTO notificationReceiverDTO = notificationReceiverVOMapper.fromUpdate(notificationReceiverUpdateRequestVO);
        NotificationReceiver notification = notificationReceiverService.update(id,notificationReceiverDTO);
        NotificationReceiverResponseVO vo = notificationReceiverVOMapper.toNotificationReceiverResponse(notification);
        return new ResponseEntity<>(vo,HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        String res = notificationReceiverService.delete(id);
        return new ResponseEntity<>(res,HttpStatus.OK);
    }
}
