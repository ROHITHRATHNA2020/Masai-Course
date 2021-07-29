package com.example.trecyclerview;

public class Model {

    public static final int text_type = 0;
    public static final int image_type = 1;
    public static final int audio_type = 2;

    private String content;
    private int resId;
    private int itemViewType;

    public Model(String content, int resId, int itemViewType) {
        this.content = content;
        this.resId = resId;
        this.itemViewType = itemViewType;
    }

    public String getContent() {
        return content;
    }

    public int getResId() {
        return resId;
    }

    public int getItemViewType() {
        return itemViewType;
    }
}
