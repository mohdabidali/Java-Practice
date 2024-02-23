package com.jwt.example.JwtExample.Model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JwtRequest {
    private  String email;
    private  String password;
}
