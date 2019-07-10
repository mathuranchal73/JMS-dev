package com.example.api.model;

import com.example.api.model.EmailToken;
import com.example.api.model.UserJson;

import java.util.UUID;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class User {

    @EmbeddedId
    public String id;
    public String login;
    public String email;
    public String emailToken;

    private User() { }

    public User(UserId id, String login, String email) {
        this.id = UUID.randomUUID().toString();;
        this.login = login;
        this.email = email;
    }

    public UserJson asJson() {
        return new UserJson(id, login, email, emailToken);
    }

    public void token(EmailToken emailToken) {
        this.emailToken = emailToken.asString();
    }

    public void generateToken() {
        this.emailToken = new EmailToken().asString();
    }

    public String token() {
        return this.emailToken;
    }
}
