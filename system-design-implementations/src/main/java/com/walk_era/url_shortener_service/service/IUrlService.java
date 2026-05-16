package com.walk_era.url_shortener_service.service;

import com.walk_era.url_shortener_service.dto.ShortUrlResponse;
import com.walk_era.url_shortener_service.dto.UrlRequest;


public interface IUrlService {

    ShortUrlResponse shorten(UrlRequest urlRequest);

    String redirect(String shortId);
}
