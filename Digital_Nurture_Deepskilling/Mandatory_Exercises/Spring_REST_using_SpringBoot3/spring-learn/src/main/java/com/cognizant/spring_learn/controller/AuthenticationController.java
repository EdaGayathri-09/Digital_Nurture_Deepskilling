package com.cognizant.spring_learn.controller;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.service.JwtService;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtService jwtService;

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(
            jakarta.servlet.http.HttpServletRequest request) {

        
        System.out.println("AUTHENTICATE API CALLED");

        String authHeader = request.getHeader("Authorization");

        if(authHeader == null || !authHeader.startsWith("Basic ")) {
            throw new RuntimeException("Missing Authorization header");
        }

        String base64Credentials =
                authHeader.substring("Basic ".length());

        String credentials = new String(Base64.getDecoder()
                .decode(base64Credentials));

        String[] values = credentials.split(":");

        String username = values[0];
        String password = values[1];

        String token = jwtService.generateToken(username);

        Map<String, String> response = new HashMap<>();

        response.put("token", token);

        return response;
    }

}