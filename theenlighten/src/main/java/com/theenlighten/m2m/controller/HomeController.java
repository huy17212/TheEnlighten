package com.theenlighten.m2m.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<String> getHome(){
        return ResponseEntity.ok().body(new String("hello"));
    }

}
