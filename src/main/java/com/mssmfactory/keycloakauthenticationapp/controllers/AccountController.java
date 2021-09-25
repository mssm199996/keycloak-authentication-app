package com.mssmfactory.keycloakauthenticationapp.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class AccountController {

    @GetMapping("account")
    public String index(@AuthenticationPrincipal Principal principal) {
        System.out.println(SecurityContextHolder.getContext().getAuthentication());

        return "Hello logged in user !";
    }
}
