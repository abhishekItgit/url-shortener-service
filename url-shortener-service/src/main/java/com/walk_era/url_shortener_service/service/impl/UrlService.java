package com.walk_era.url_shortener_service.service.impl;

import com.walk_era.url_shortener_service.dto.ShortUrlResponse;
import com.walk_era.url_shortener_service.dto.UrlRequest;
import com.walk_era.url_shortener_service.entity.UrlShortner;
import com.walk_era.url_shortener_service.repository.IUrlShortenerRepo;
import com.walk_era.url_shortener_service.service.IUrlService;
import com.walk_era.url_shortener_service.util.Base62Util;
import com.walk_era.url_shortener_service.util.SnowFlakeIDGenerator;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;


@Service
public class UrlService implements IUrlService {
    private final SnowFlakeIDGenerator snowFlakeIDGenerator;
    private final IUrlShortenerRepo iUrlShortenerRepo;


    public UrlService(SnowFlakeIDGenerator snowFlakeIDGenerator,
                      IUrlShortenerRepo iUrlShortenerRepo) {
        this.snowFlakeIDGenerator = snowFlakeIDGenerator;
        this.iUrlShortenerRepo = iUrlShortenerRepo;
    }

    @Override
    public ShortUrlResponse shorten(UrlRequest urlRequest) {
        String longUrl = urlRequest.getLongUrl();
        long id = snowFlakeIDGenerator.nextId(1);
        String shortCode;
        if (urlRequest.getCustomAlias() != null && !urlRequest.getCustomAlias().isBlank()) {
            shortCode = urlRequest.getCustomAlias();
        } else {
            shortCode = Base62Util.getBase62(id);
        }
        if (iUrlShortenerRepo.existsByShortCode(shortCode)) {
            throw new RuntimeException("short url already exist");
        }

        UrlShortner urlShortner = UrlShortner.builder()
                .shortCode("http://localhost:8080/" + shortCode).longUrl(longUrl)
                .createdBy(1)
                .expiredAt(urlRequest.getExpiryAt())
                .createdAt(LocalDateTime.now())
                .isActive(true)
                .build();
        iUrlShortenerRepo.save(urlShortner);

        // todo redis;

        return ShortUrlResponse.builder().shortUrl(shortCode)
                .longUrl(longUrl).expiryAt(urlRequest.getExpiryAt()).build();

    }

    @Override
    public String redirect(String shortCode) {
        Optional<UrlShortner> urlShortener = Optional.ofNullable(iUrlShortenerRepo.findByShortCode(shortCode)
                .orElseThrow(() -> new RuntimeException("Short URL not found: " + shortCode)));
        return urlShortener.get().getLongUrl();
    }
}
