package com.example.cicd17;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class CicdController {
    
    @GetMapping
    public String printHello(){
        return "Hello";
    }
}
