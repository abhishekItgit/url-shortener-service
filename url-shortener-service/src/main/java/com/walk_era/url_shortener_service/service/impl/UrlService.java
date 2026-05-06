package com.walk_era.url_shortener_service.service.impl;

import com.walk_era.url_shortener_service.dto.UrlRequest;
import com.walk_era.url_shortener_service.dto.UrlResponse;
import com.walk_era.url_shortener_service.service.IUrlService;
import org.springframework.stereotype.Service;


@Service
public class UrlService implements IUrlService {


    @Override
    public UrlResponse shorten(UrlRequest urlRequest) {
        return null;
    }

    @Override
    public void redirect(String shortId) {

    }
}
