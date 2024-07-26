package com.example.demo.controller;

import com.example.demo.api.CommonApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController implements CommonApi {
    @Override
    @GetMapping("/auth")
    public void authorize(String email, String password) {
        //TODO()
    }
}
