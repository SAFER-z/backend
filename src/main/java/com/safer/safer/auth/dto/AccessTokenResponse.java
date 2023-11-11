package com.safer.safer.auth.dto;

public record AccessTokenResponse(
        String accessToken
) {
    public static AccessTokenResponse of(String accessToken) {
        return new AccessTokenResponse(accessToken);
    }
}
