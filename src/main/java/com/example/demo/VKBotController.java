package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VKBotController {

    @Autowired
    VKService vkService;// creating bean of VKService to send message back to user
    @Value("${vk.callback.answer}")
    String answer; // callback answer to confirm callback API


    @PostMapping
    public String messageReceiver(@RequestBody VKMessage message) {
        if (message.getType().equals("confirmation")) {

            return answer;
        }
        vkService.sendMessage(message.getObject().getMessage().getPeer_id(), message.getObject().getMessage().getText()); // passing ID of user, message to send and random_ID
        return "ok";
    }


}
