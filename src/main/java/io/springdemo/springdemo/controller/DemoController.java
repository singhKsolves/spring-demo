package io.springdemo.springdemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String welcome(){
        return "Welcome to OpenShift!";
    }

}
