package com.example.restapicalls.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    // Step-1 Create a method to get the message
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // Step-2 Creating a method to get the request using parameter name
    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    //Step-3 Maps GET requests with a path variable
    @GetMapping("/param/{name}")
    public String sayHelloWithPath(@PathVariable String name) {
        // Returns a greeting message with the provided name
        return "Hello " + name + " from BridgeLabz";
    }
}
