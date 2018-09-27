package com.academia.handson.invillia.services;

import com.academia.handson.invillia.clients.S2itClient;
import com.academia.handson.invillia.dto.MessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private Environment environment;

    @Autowired
    private S2itClient s2itClient;


    public MessageDTO getMessage() {
        String message = "My message service [invillia] " + s2itClient.getS2itMessage().getMessage();

        return new MessageDTO(message, Integer.valueOf(environment.getProperty("local.server.port")), s2itClient.getS2itMessage().getS2itPort());
    }

}
