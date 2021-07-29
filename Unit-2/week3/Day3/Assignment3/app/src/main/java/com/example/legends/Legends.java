package com.example.legends;

public class Legends {

    private String companyName;
    private int image;
    private String age;
    private String profession;

    public Legends(String companyName, int image, String age, String profession) {
        this.companyName = companyName;
        this.image = image;
        this.age = age;
        this.profession = profession;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getImage() {
        return image;
    }

    public String getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }
}

