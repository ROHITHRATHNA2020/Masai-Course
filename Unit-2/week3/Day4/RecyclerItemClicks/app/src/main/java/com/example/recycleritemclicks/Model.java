package com.example.recycleritemclicks;

import android.widget.ImageView;
import android.widget.TextView;

public class Model {

    private int image;
    private String text;
    private String description;

    public Model(int image, String text, String description) {
        this.image = image;
        this.text = text;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public String getText() {
        return text;
    }

    public String getDescription() {
        return description;
    }


}
