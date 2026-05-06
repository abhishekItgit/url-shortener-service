package com.walk_era.url_shortener_service.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class ShortUrlResponse {

    private String shortUrl;

    private String longUrl;

    private LocalDateTime expiryAt;
}
