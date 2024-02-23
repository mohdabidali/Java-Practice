package com.jwt.example.JwtExample.Service;

import com.jwt.example.JwtExample.Model.User;
import com.jwt.example.JwtExample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;
  @Autowired
  private UserRepository userRepository;

    public List<User> getUser() {
        return userRepository.findAll();

    }
    public  User createUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
}
