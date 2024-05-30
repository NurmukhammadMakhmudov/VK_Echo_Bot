package com.example.demo;





import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

// Service to send message back to user
@Service
public class VKService {
    private final String accessToken;
    public VKService (@Value("${vk.api}") String accessToken) {
        this.accessToken = accessToken;
        System.out.println(accessToken);
    }
    private final String apiVersion = "5.131";


    public void sendMessage(long peer_id, String message) {
        String newMessage = "you said: " + message;
        String url = String.format("https://api.vk.com/method/messages.send?peer_id=%d&message=%s&access_token=%s&v=%s&random_id=%s", peer_id, newMessage, accessToken, apiVersion, new Date().getTime());
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForObject(url, String.class);
    }
}