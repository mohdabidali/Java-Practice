package com.jwt.example.JwtExample.Model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JwtResponse {
    private  String jwtToken;
    private  String username;
}
