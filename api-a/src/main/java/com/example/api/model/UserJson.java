package com.example.api.model;

import com.example.api.model.UserId;

public class UserJson {
    public String id;
    public String login;
    public String email;
    public String emailToken;

    public UserJson(String id, String login, String email, String emailToken) {
        this.id = id;
        this.login = login;
        this.email = email;
        this.emailToken = emailToken;
    }

	
}
