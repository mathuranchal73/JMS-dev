package com.example.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.api.model.User;
import com.example.api.model.UserCreated;
import com.example.api.model.UserId;
import com.example.api.repository.UserRepository;

@Transactional
@Service
public class UserService {

	@Autowired
    private  UserRepository userRepository;
    private  ApplicationEventPublisher eventPublisher;

   

    public User getUser(String id) {
        return userRepository.find(id);
    }

    public User createUser(User user) {
        User savedUser = userRepository.save(user);
        eventPublisher.publishEvent(new UserCreated(savedUser.id));
        return savedUser;
    }

}
