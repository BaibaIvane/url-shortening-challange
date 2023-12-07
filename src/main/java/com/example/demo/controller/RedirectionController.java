package com.example.demo.controller;

import com.example.demo.service.ShortURLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletResponse;

@Controller
public class RedirectionController {

    @Autowired
    private ShortURLService shortURLService;

    @GetMapping("/{shortened}")
    public void redirectToOriginal(@PathVariable("shortened") String shortened, HttpServletResponse response) {
        String originalURL = shortURLService.getLongURL(shortened);

        if (originalURL != null) {
            response.setHeader("Location", originalURL);
            response.setStatus(302); // Redirect status
        } else {
            response.setStatus(404); // Not Found
        }
    }
}
