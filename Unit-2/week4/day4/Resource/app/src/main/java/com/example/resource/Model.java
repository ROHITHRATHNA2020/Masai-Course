package com.example.resource;

public class Model {

    private String firstName;
    private String LastName;
    private String Email;

    public Model(String firstName, String lastName, String email) {
        this.firstName = firstName;
        LastName = lastName;
        Email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return Email;
    }
}
