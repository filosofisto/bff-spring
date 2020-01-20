package br.com.caixaseguradora.arealogada.bff.getcontratopessoa;

import br.com.caixaseguradora.arealogada.bff.model.Contrato;
import br.com.caixaseguradora.arealogada.bff.support.NetworkClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ContratoClient extends NetworkClient {

    @Value("${url.getContratoPessoa}")
    private String urlBase;

//    private final RestTemplate restTemplate;

//    @Autowired
//    public ContratoClient(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }

    public Contrato[] getContratoPessoa(String cpf, String token) {
        // Authorization header
        final HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + token);
        headers.set("X-IBM-Client-Id", clientId);
        headers.set("scope", "CORP");
        headers.set("Accept", "application/json");
        headers.set("Content-Type", "application/json; charset=utf-8");
        final HttpEntity<String> entity = new HttpEntity<String>(headers);

        ResponseEntity<Contrato[]> response = new RestTemplate().exchange(
                urlFor(cpf), HttpMethod.GET, entity, Contrato[].class
        );

        return response.getBody();
    }

    private String urlFor(String cpf) {
        return String.format("%s/%s/ativo", urlBase, cpf);
    }
}
