package com.safer.safer.auth.infrastructure.kakao;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("oauth2.kakao")
public record KakaoProperties(
        String clientId,
        String clientSecret,
        String responseType,
        String grantType,
        String authorizationUri,
        String redirectUri,
        String tokenUri,
        String userInfoUri
) {
}
