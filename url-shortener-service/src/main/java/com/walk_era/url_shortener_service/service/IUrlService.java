package com.walk_era.url_shortener_service.service;

import com.walk_era.url_shortener_service.dto.UrlRequest;
import com.walk_era.url_shortener_service.dto.UrlResponse;

public interface IUrlService {

     UrlResponse shorten(UrlRequest urlRequest);
     void redirect(String shortId);
}
