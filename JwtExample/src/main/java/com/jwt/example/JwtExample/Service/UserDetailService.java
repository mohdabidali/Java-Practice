package com.jwt.example.JwtExample.Service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailService {
    // JWT ke Liye USER DETAILS
    UserDetails loadUserByUserName(String name) throws UsernameNotFoundException;

}
