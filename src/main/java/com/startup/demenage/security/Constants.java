package com.startup.demenage.security;

public class Constants {
    public static final String ENCODER_ID = "bcrypt";
    public static final String API_URL_PREFIX = "/api/v1/**";
    public static final String H2_URL_PREFIX = "/h2-console/**";
    public static final String SIGNUP_URL = "/api/v1/users";

    public static final String TOKEN_URL = "/api/v1/auth/token";
    public static final String REFRESH_URL =
    "/api/v1/auth/token/refresh";
    public static final String AUTHORIZATION =
    "Authorization";
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String SECRET_KEY = "SECRET_KEY";
    public static final long EXPIRATION_TIME = 7_200_000;
    public static final String ROLE_CLAIM = "roles";
    public static final String AUTHORITY_PREFIX = "ROLE_";
}
