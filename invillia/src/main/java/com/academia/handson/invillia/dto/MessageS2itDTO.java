package com.academia.handson.invillia.dto;

public class MessageS2itDTO {

    private String message;
    private int s2itPort;

    public MessageS2itDTO() {
    }

    public MessageS2itDTO(String message, int s2itPort) {
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
