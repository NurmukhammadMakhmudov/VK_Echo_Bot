package com.example.demo;

// POJO class to parse data
public class VKMessage {
    private String type;
    private MessageObject object;
    private int group_id;

    // Getters
    public String getType() {
        return type;
    }

    public int getGroup_id() {
        return group_id;
    }

    public MessageObject getObject() {
        return object;
    }


    public static class MessageObject {
        private Message message;

        // Getters
        public Message getMessage() {
            return message;
        }


    }

    public static class Message {
        private String text;
        private long peer_id;

        // Getters
        public long getPeer_id() {
            return peer_id;
        }

        public String getText() {
            return text;
        }

    }


}

