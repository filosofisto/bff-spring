package br.com.caixaseguradora.arealogada.bff.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public abstract class NetworkClient {

    @Value("${security.clientId}")
    protected String clientId;

    @Autowired
    protected RestTemplate restTemplate;

    @Bean
    public RestTemplate rest() {
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate;
    }
}
