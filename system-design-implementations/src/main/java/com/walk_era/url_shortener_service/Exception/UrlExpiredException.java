package com.walk_era.url_shortener_service.Exception;

public class UrlExpiredException extends RuntimeException{

    public UrlExpiredException(String message){
        super(message);
    }

}
