package com.challenge.config.security;

import com.challenge.SpringApplicationContext;
import com.challenge.config.AppProperties;

public class SecurityConstants {

    public static final long EXPIRATION_TIME = 1000 * 60 * 60 * 24; // 1 day
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";

    public static String getTokenSecret() {
        AppProperties appProperties = (AppProperties) SpringApplicationContext.getBean("appProperties");
        return appProperties.getTokenSecret();
    }

}
