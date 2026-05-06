package com.walk_era.url_shortener_service.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UrlRequest {

    private String longUrl;

    private String customAlias;

    private LocalDateTime expiryAt;
}
