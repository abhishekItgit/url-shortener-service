package com.walk_era.url_shortener_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Entity
@Table(name = "urlShortner")
@Data
public class UrlShortner {
    @Id()
    private Long uid;
    private  String shortUrl;
    private String longUrl;
    private boolean isActive;
    private  long createdBy;
    private LocalDateTime createdAt;
    private LocalDateTime expiredAt;

}
