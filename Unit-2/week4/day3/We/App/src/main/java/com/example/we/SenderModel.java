package com.example.we;

public class SenderModel implements BaseModel {

    private String senderMessage;

    public SenderModel(String message) {
        this.senderMessage = message;
    }

    public String getMessage() {
        return senderMessage;
    }

    @Override
    public int getViewType() {
        return 0;
    }
}
