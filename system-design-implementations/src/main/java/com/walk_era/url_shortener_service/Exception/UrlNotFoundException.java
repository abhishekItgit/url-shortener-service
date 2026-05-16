package com.walk_era.url_shortener_service.Exception;

public class UrlNotFoundException extends RuntimeException{

    public  UrlNotFoundException(String message){
        super(message);
    }

}
