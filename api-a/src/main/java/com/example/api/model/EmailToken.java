package com.example.api.model;

import java.util.UUID;

public class EmailToken {

    private final String token;

    public EmailToken(String token) {
        this.token = token;
    }

    public EmailToken() {
        token = UUID.randomUUID().toString();
    }

    public String asString() {
        return token;
    }
}
