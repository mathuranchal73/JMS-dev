package com.example.api.model;

import com.example.api.model.User;
import com.example.api.model.UserId;

public class CreateUserJson {
    public String login;
    public String email;

    public User asUser() {
        return new User(new UserId(), login, email);
    }
}
