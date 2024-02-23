package com.jwt.example.JwtExample.repository;

import com.jwt.example.JwtExample.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<User,String> {
    public Optional<User>  findByEmail(String email);

}
