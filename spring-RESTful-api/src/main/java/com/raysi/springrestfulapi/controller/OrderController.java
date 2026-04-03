package com.raysi.springrestfulapi.controller;


import com.raysi.springrestfulapi.enitity.Orders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @PostMapping("/api/post-order")
    ResponseEntity<String> postOrder(@RequestBody Orders order){
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(order.toString());
    }
}
