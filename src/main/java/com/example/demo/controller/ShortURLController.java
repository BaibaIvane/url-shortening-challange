package com.example.demo.controller;

import com.example.demo.service.ShortURLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ShortURLController {

    @Autowired
    private ShortURLService shortURLService;

    @PostMapping("/shorten")
    public ResponseEntity<String> shortenURL(@RequestBody String longURL) {
        String shortenedURL = shortURLService.generateShortURL(longURL);
        return  ResponseEntity.ok(shortenedURL);
    }

}

