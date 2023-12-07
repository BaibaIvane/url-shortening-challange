package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

@Service
public class ShortURLService {

    private HashMap<String, String> urlMap = new HashMap<>(); // This stores the mapping

    public String generateShortURL(String longURL) {
        String shortenedURL = null;
        try {
            URL url = new URL(longURL);
            shortenedURL = url.getHost().replace("www.", "").replace(".com", "");

            //TODO
            //Unfinished idea of shortening path

//            String[] pathSegments = url.getPath().split("/");
//            StringBuilder shortPath = new StringBuilder();
//            for (String segment : pathSegments) {
//                if (!segment.isEmpty()) {
//                    shortPath.append(segment.charAt(0));
//                }
//            }

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        urlMap.put(shortenedURL, longURL);
        return shortenedURL;
    }

    // Method to retrieve original URL from shortened URL
    public String getLongURL(String shortURL) {
        return urlMap.get(shortURL);
    }
}
