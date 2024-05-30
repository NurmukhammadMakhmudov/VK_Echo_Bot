package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class VKBotController {

    @PostMapping
    public String messageReceiver(@RequestBody VKMessage message) throws IOException {
        VKService vkService = new VKService(); // creating object of VKService to send message back to user
        vkService.sendMessage(message.getObject().getMessage().getPeer_id(), message.getObject().getMessage().getText()); // passing ID of user, message to send and random_ID
        return "ok";
    }


}
