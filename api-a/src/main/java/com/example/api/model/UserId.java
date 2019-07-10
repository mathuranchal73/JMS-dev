package com.example.api.model;

import java.io.Serializable;
import java.util.UUID;

public class UserId implements Serializable {
    String id;

   

    public UserId() {
        this.id = UUID.randomUUID().toString();
    }

    public String asString() {
        return id;
    }
}
