package com.academia.handson.s2it.services;

import com.academia.handson.s2it.dto.MessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private Environment environment;


    public MessageDTO getMessage() {
        return new MessageDTO("My message service", Integer.valueOf(environment.getProperty("local.server.port")));
    }

}
