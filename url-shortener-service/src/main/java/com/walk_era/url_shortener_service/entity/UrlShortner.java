package com.walk_era.url_shortener_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "url_shortner")
@Data
public class UrlShortner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;
    @Column(name ="short_code")
    private  String shortCode;
    @Column(name ="long_url")
    private String longUrl;
    @Column(name = "is_active")
    private boolean isActive;
    @Column(name = "created_by")
    private  long createdBy;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "expired_at")
    private LocalDateTime expiredAt;

}
