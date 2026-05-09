package com.walk_era.url_shortener_service.util;

public class Base62Util {

    private static final String BASE62 =  "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static String getBase62(Long value){
        StringBuilder sb = new StringBuilder();
        while(value>0){
            int mod = (int)(value % 62);
            sb.append(BASE62.charAt(mod));
            value /= 62;
        }
        return sb.reverse().toString();
    }

}
