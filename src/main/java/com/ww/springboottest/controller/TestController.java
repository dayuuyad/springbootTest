package com.ww.springboottest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test/health")
    public String healthCheck() {
        return "{\"status\":\"UP\",\"timestamp\":\"" +
                java.time.LocalDateTime.now() + "\"}";
    }

    @GetMapping("/test/hello")
    public String hello() {
        return "Hello, Spring Boot is running!";
    }

    @GetMapping("/test/info")
    public String appInfo() {
        return "{\"app\":\"Spring Boot Demo\",\"version\":\"1.0\"}";
    }
}