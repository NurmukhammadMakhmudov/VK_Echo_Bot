package com.example.vk_echo_bot;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

// Service to send message back to user
@Service
public class VKService {


    public VKService() {
    }


    @Value("${vk.api.key}")
    private String accessToken;// Getting API Token form properties
    @Value("${vk.api.version}")
    private String apiVersion; // Getting Version Token form properties
    @Value("${vk.url}")
    String vkUrl; // Getting URL


    public void sendMessage(long peer_id, String message) {
        RestTemplate restTemplate = new RestTemplate();
        String newMessage = "you said: " + message;
        String url = String.format(vkUrl, peer_id, newMessage, accessToken, apiVersion, new Date().getTime());
        restTemplate.getForObject(url, String.class);
    }
}

