package br.com.caixaseguradora.arealogada.bff.support;

import org.springframework.beans.factory.annotation.Value;

public abstract class NetworkClient {

    @Value("${security.clientId}")
    protected String clientId;

}
