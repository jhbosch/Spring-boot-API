package com.example.restapi.controllers;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0")
public class StudentRestController {


    @GetMapping("/students")
    public List<String> all() {
        String [] p = new String[] {"A" ,"B" ,"C"};
               

        return List.of(p);
    }
    
}