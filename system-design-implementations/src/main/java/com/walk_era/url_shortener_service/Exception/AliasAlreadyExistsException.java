package com.walk_era.url_shortener_service.Exception;

public class AliasAlreadyExistsException extends RuntimeException{

    public AliasAlreadyExistsException(String message){
        super(message);
    }

}
