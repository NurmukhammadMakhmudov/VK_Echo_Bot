package com.example.demo;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

// Service to send message back to user
@Service
public class VKService {

    @Value("${vk.api}")
    private String accessToken; //"vk1.a.j_cuIK1gPa7nwbgtE4n2faZ8Stenhh0SeD1Ti8nkfTfoX77rGcAm2v2Oida5mPGqFoP-2h13uFlGQvvutpQHE4Jik9HDZc9GVeT8_TrED3lrXA41A7CAeJyH2uLbB49bucH3jVbcGoaRGbnT2hNNmmIYwDqfjbXhJfllBA0JfBHy-tNI9jsziT8t1WgfIYWQ-3g8sKg-X-LS1zf-I4EyBA";
    private String apiVersion = "5.131";

    private final Date date = new Date(); // Date used for retrieving random id

    public String getAccessToken() {
        return accessToken;
    }

    //Bot token

    public void sendMessage(long peer_id, String message) {
        String newMessage = "you said: " + message;
        String url = String.format("https://api.vk.com/method/messages.send?peer_id=%d&message=%s&access_token=%s&v=%s&random_id=%s", peer_id, newMessage, accessToken, apiVersion, date.getTime());
        RestTemplate restTemplate = new RestTemplate();
        System.out.println(url);
        String d = restTemplate.getForObject(url, String.class);
        System.out.println(d);


    }
}
//
//vk.api.version=5.131
//confirmation.response=49e771dd
//server.port=8080
//spring.application.name=demo
//vk.callback.url= https://fe17-95-47-153-14.ngrok-free.app
