package com.dragontalker.spring5.test;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserLog {

    private static final Logger log = LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        log.info("Hello Log4J2!");
        log.warn("Warning!!!!");
    }
}
