package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class JavaCloudrunAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaCloudrunAppApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "<html>" +
               "<body style='background-color: lightblue; display: flex; justify-content: center; align-items: center; height: 100vh; margin: 0;'>" +
               "<div style='text-align: center;'>" +
               "<h1>Hello, Shaik!</h1>" +
               "<p>You're going to be a DevOps engineer soon!</p>" +
               "</div>" +
               "</body>" +
               "</html>";
    }
}