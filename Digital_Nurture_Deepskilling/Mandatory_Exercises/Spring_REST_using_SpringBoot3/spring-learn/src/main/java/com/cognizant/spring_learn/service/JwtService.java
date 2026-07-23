package com.cognizant.spring_learn.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class JwtService {

    private String secret = "mysecretkeymysecretkeymysecretkey1234567890";

    public String generateToken(String username) {

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(
                        new Date(System.currentTimeMillis() + 1000 * 60 * 30))
                .signWith(
                        SignatureAlgorithm.HS256,
                        secret)
                .compact();
    }
}