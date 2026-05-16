package com.walk_era.url_shortener_service.util;

import org.springframework.stereotype.Component;

@Component
public class SnowFlakeIDGenerator {
    private long sequence =0;
    private long  lastTimeStamp =-1;

    public synchronized long nextId(long machineID){
        long currentTimestamp  = System.currentTimeMillis();
        if(currentTimestamp == lastTimeStamp ) sequence++;
        else sequence= 0;
        lastTimeStamp = currentTimestamp;

        return (lastTimeStamp<<22)|(machineID<<12)|sequence;

    }


}
