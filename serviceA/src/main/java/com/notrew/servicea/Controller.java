package com.notrew.servicea;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicea")
public class Controller {
    @GetMapping
    public  ResponseEntity<String> getHello(){
        return ResponseEntity.ok("Hello, service A");
    }
}
