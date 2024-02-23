package com.jwt.example.JwtExample.Service;

import com.jwt.example.JwtExample.Model.User;
import com.jwt.example.JwtExample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService  implements UserDetailService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUserName(String name) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(name).orElseThrow(()-> new RuntimeException("User NOT Found"));
//       load user from database
        return  user;
    }
}
