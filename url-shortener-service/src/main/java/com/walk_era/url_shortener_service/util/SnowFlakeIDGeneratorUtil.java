package com.walk_era.url_shortener_service.util;

public class SnowFlakeIDGeneratorUtil {
    private long sequence =0;
    private long  lastTimeStamp;

    public synchronized long nextId(long machineID){
        long currentTimestamp  = System.currentTimeMillis();
        if(currentTimestamp == lastTimeStamp ) sequence++;
        else sequence= 0;
        lastTimeStamp = currentTimestamp;

        return (lastTimeStamp<<22)|(machineID<<12)|sequence;

    }


}
