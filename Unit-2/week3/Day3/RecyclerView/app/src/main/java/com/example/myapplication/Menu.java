package com.example.myapplication;

public class Menu {
    private int image;
    private String itemName;
    private double price;

    public Menu(int image, String itemName, double price) {
        this.image = image;
        this.itemName = itemName;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }
}
