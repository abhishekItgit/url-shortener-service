package com.walk_era.url_shortener_service.controller;

import com.walk_era.url_shortener_service.dto.UrlRequest;
import com.walk_era.url_shortener_service.dto.UrlResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("api/v1/url")
public class UrlController {

    @PostMapping("/shorten")
    public ResponseEntity<UrlResponse> urlShorten(@RequestBody UrlRequest urlRequest){
        UrlResponse urlResponse = new UrlResponse();
       return  ResponseEntity.ok(urlResponse);
    }

    @GetMapping("/{shortId}")
    public ResponseEntity<Void> redirect(@PathVariable String shortId){

        String longUrl = "";
     return   ResponseEntity.status(HttpStatus.FOUND)
                .location(URI.create(longUrl))
                .build();

    }



}


