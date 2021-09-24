package com.mssmfactory.keycloakauthenticationapp.controllers;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("account")
    public String index(OAuth2AuthenticationToken token) {
        System.out.println(token);

        return "Hello logged in user !";
    }
}
