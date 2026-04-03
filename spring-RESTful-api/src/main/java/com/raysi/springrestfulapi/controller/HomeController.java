package com.raysi.springrestfulapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HomeController {
    @GetMapping("/")
    ResponseEntity<String> getHome(){
        String message = "<h1> Welcome to Spring after so long Aashish</h1>";
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(message);
    }
    @GetMapping("/user")
    ResponseEntity<String> paramValue(
            @RequestParam String userFirstName,
            @RequestParam String userLastName
    ){
        String html = "<h1>" + userFirstName + "-" + userLastName + "</h1>";
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(html);
    }
}
