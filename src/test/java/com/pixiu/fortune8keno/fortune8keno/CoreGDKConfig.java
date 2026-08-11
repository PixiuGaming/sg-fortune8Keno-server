package com.pixiu.fortune8keno.fortune8keno;


import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.info.GitProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
@RequiredArgsConstructor
public class CoreGDKConfig {




    private final GitProperties gitProperties;

    private final RestTemplate restTemplate;

    private final HttpServletRequest httpServletRequest;





}
