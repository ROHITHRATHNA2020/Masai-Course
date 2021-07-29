package com.example.we;

public class ReceiverModel implements BaseModel {

    private String receiveMessage;

    public ReceiverModel(String message) {
        this.receiveMessage = message;
    }

    public String getMessage() {
        return receiveMessage;
    }

    @Override
    public int getViewType() {
        return 1;
    }
}

