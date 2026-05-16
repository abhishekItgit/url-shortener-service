package com.walk_era.url_shortener_service.repository;

import com.walk_era.url_shortener_service.entity.UrlShortner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUrlShortenerRepo extends JpaRepository<UrlShortner, Long> {

    Optional<UrlShortner> findByShortCode(String ShortCode);

    boolean existsByShortCode(String ShortCode);

}
