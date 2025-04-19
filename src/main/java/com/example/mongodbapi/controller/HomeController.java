package com.example.mongodbapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/ApiStatus")
public class HomeController {

    @GetMapping("/Check")
    public ResponseEntity<String> StatusCheck()
    {
       return ResponseEntity.ok("running");
    }
}
