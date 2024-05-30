package com.example.demo;

import lombok.Getter;


// POJO class to parse data,used lombok for getters and setters
@Getter
public class VKMessage {
    // Getters
    private String type;
    private MessageObject object;
    private int group_id;


    @Getter
    public static class MessageObject {
        private Message message;


    }

    @Getter
    public static class Message {
        private String text;
        private long peer_id;

    }


}

