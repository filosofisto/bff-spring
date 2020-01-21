package br.com.caixaseguradora.arealogada.bff.previdencia.creditoemconta;

import br.com.caixaseguradora.arealogada.bff.model.CreditoEmContaOutput;
import br.com.caixaseguradora.arealogada.bff.model.CreditoEmContaInput;
import br.com.caixaseguradora.arealogada.bff.support.NetworkClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CreditoEmContaClient extends NetworkClient {

    @Value("${url.creditoEmConta}")
    private String urlBase;

    public CreditoEmContaOutput post(
            CreditoEmContaInput creditoEmContaInput,
            String token) {
        final HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + token);
        headers.set("X-IBM-Client-Id", clientId);
//        headers.set("scope", "DIRVI DIPREV DIRID CORP");
        headers.set("Accept", "application/json");
        headers.set("Content-Type", "application/json; charset=utf-8");
        final HttpEntity<String> entity = new HttpEntity<String>(headers);

        ResponseEntity<CreditoEmContaOutput> response = new RestTemplate().postForEntity(
                urlFor(creditoEmContaInput.getCertificado()), creditoEmContaInput, CreditoEmContaOutput.class, entity
        );

        return response.getBody();
    }

    private String urlFor(String certificado) {
        return String.format(
                "%s/%s",
                urlBase, certificado
        );
    }
}
