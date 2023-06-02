package com.example.university.carter.repository;

import com.example.university.carter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Long> {
        Optional<User> findByEmail(String email);
        Optional<User> findByMobile(String mobile);


    }
