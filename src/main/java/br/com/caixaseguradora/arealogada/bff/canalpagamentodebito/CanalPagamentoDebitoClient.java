package br.com.caixaseguradora.arealogada.bff.canalpagamentodebito;

import br.com.caixaseguradora.arealogada.bff.model.CanalPagamentoDebito;
import br.com.caixaseguradora.arealogada.bff.support.NetworkClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class CanalPagamentoDebitoClient extends NetworkClient {

    @Value("${url.getListaCanalPagamentoDebito}")
    private String urlBase;

    public CanalPagamentoDebito[] get(String certificado, String cpf, String codigoEmpresa, String token) {
        final HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + token);
        headers.set("X-IBM-Client-Id", clientId);
        headers.set("scope", "DIRVI DIPREV DIRID CORP");
        headers.set("Accept", "application/json");
        headers.set("Content-Type", "application/json; charset=utf-8");
        final HttpEntity<String> entity = new HttpEntity<String>(headers);

        ResponseEntity<ListaCanalPagamentoDebito> response = restTemplate.exchange(
                urlFor(certificado, cpf, codigoEmpresa), HttpMethod.GET, entity, ListaCanalPagamentoDebito.class
        );

        return response.getBody().getLista_canais_pagamento_debito();
    }

    // 15547745/canal_pagamento_debito?usuario=02808283148&codigo_empresa=500'
    private String urlFor(String certificado, String cpf, String codigoEmpresa) {
        return String.format(
                "%s/%s/canal_pagamento_debito?usuario=%s&codigo_empresa=%s",
                urlBase, certificado, cpf, codigoEmpresa
        );
    }
}
