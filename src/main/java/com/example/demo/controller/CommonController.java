package com.example.demo.controller;

import com.example.demo.api.CommonApi;
import com.example.demo.data.model.usecase.AuthorizeUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CommonController implements CommonApi {

    private final AuthorizeUserUseCase authorizeUserUseCase;

    @Override
    @GetMapping("/auth")
    public ResponseEntity<String> authorize(String email, String password) {
        try {
            if (!authorizeUserUseCase.authorizeUser(email, password)) {
                throw new Exception();
            }
            return ResponseEntity.ok().body(null);
        } catch (Exception e) {
            return ResponseEntity.status(404).body(null);
        }
    }
}
