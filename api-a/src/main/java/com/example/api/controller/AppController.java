package com.example.api.controller;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.example.api.model.CreateUserJson;
import com.example.api.model.UserJson;
import com.example.api.service.UserService;
import com.example.api.model.User;
import com.example.api.model.UserId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class AppController {

	@Autowired
    private final UserService userService;

    public AppController(UserService userService) {
        this.userService = userService;
    }

   /** @GetMapping("/{id}")
    public UserJson getUser(@PathVariable("id") String id) {
        return userService.getUser().asJson();
    }
**/
    @PostMapping
    public UserJson registerUser(@RequestBody CreateUserJson createUserJson) {
        User savedUser = userService.createUser(createUserJson.asUser());
        return savedUser.asJson();
    }

}

