package com.academia.handson.s2it.dto;

public class MessageDTO {

    private String message;
    private int s2itPort;

    public MessageDTO() {
    }

    public MessageDTO(String message, int s2itPort) {
        this.message = message;
        this.s2itPort = s2itPort;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getS2itPort() {
        return s2itPort;
    }

    public void setS2itPort(int s2itPort) {
        this.s2itPort = s2itPort;
    }
}
