package com.academia.handson.invillia.resources;

import com.academia.handson.invillia.dto.MessageDTO;
import com.academia.handson.invillia.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageResource {

    @Autowired
    private MessageService service;

    @GetMapping("/messages")
    public MessageDTO getMessage() {
        return service.getMessage();
    }


}


