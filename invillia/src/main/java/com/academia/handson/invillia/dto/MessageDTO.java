package com.academia.handson.invillia.dto;

public class MessageDTO {

    private String message;
    private int s2itPort;
    private int invilliaPort;

    public MessageDTO() {
    }

    public MessageDTO(String message, int invilliaPort, int s2itPort) {
        this.message = message;
        this.s2itPort = s2itPort;
        this.invilliaPort = invilliaPort;
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

    public int getInvilliaPort() {
        return invilliaPort;
    }

    public void setInvilliaPort(int invilliaPort) {
        this.invilliaPort = invilliaPort;
    }
}
