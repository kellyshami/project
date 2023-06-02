package com.example.university.carter.model;

public  enum Role {
    USER("UserModel"),
    ADMIN("Admin");

    private final String value;

    private Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
