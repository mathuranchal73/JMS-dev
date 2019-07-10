package com.example.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api.model.User;
import com.example.api.model.UserId;

@Repository
public interface UserRepository extends JpaRepository <User, String>{

    User find(String userId);
    User save(User user);
}
