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
        return "Hello, Shaik ! You're going to be a DevOps engineer soon!";
    }
}
