package com.example.practice;

public class Model {
    private String title;
    private int userId;

    public Model(String title, int userId) {
        this.title = title;
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public int getUserId() {
        return userId;
    }
}
