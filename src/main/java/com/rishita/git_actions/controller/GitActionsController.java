package com.rishita.git_actions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitActionsController {

    @GetMapping("/user")
    public String retrieveMessage(){

        return "Hello Rishita";
    }
}
