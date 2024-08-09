package com.example.demo.api;

import org.springframework.http.ResponseEntity;

public interface CommonApi {
    public ResponseEntity<String> authorize(String email, String password);
}
