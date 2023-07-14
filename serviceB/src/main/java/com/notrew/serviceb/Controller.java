package com.notrew.serviceb;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceb")
public class Controller {
    @GetMapping
    public ResponseEntity<String> getHello(){
        return ResponseEntity.ok("Hello, service B");
    }
}
