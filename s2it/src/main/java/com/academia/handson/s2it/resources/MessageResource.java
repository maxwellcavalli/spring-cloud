package com.academia.handson.s2it.resources;

import com.academia.handson.s2it.dto.MessageDTO;
import com.academia.handson.s2it.services.MessageService;
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


