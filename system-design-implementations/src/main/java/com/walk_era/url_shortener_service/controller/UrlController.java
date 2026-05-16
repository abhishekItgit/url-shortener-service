package com.walk_era.url_shortener_service.controller;

import com.walk_era.url_shortener_service.dto.ShortUrlResponse;
import com.walk_era.url_shortener_service.dto.UrlRequest;

import com.walk_era.url_shortener_service.service.IUrlService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("api/v1/url")
public class UrlController {

    private final IUrlService iUrlService;

    public UrlController(IUrlService iUrlService) {
        this.iUrlService = iUrlService;
    }

    @PostMapping("/shorten")
    public ResponseEntity<ShortUrlResponse> urlShorten(@RequestBody UrlRequest urlRequest) {
        ShortUrlResponse urlResponse = iUrlService.shorten(urlRequest);
        return ResponseEntity.ok(urlResponse);
    }

    @GetMapping("/{shortId}")
    public ResponseEntity<Void> redirect(@PathVariable String shortId) {

        String longUrl = iUrlService.redirect(shortId);
        return ResponseEntity.status(HttpStatus.FOUND)
                .location(URI.create(longUrl))
                .build();

    }


}


