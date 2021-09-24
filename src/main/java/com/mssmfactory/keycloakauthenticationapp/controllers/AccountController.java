package com.mssmfactory.keycloakauthenticationapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("account")
    public String index() {
        return "Hello logged in user !";
    }
}
