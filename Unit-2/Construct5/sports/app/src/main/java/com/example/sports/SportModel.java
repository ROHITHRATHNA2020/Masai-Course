package com.example.sports;

public class SportModel {

    private int Image;
    private String sportName;

    public SportModel(int image, String sportName) {
        Image = image;
        this.sportName = sportName;
    }

    public int getImage() {
        return Image;
    }

    public String getSportName() {
        return sportName;
    }
}
