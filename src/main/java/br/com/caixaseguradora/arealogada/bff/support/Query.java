package br.com.caixaseguradora.arealogada.bff.support;

import br.com.caixaseguradora.arealogada.bff.canalpagamentodebito.CanalPagamentoDebitoClient;
import br.com.caixaseguradora.arealogada.bff.model.CanalPagamentoDebito;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Query implements GraphQLQueryResolver {

    private final CanalPagamentoDebitoClient canalPagamentoDebitoClient;

    @Autowired
    public Query(CanalPagamentoDebitoClient canalPagamentoDebitoClient) {
        this.canalPagamentoDebitoClient = canalPagamentoDebitoClient;
    }

    public Iterable<CanalPagamentoDebito> getListaCanalPagamentoDebito(
            String certificado, String cpf, String codigoEmpresa, String token) {
        return Arrays.asList(this.canalPagamentoDebitoClient.get(certificado, cpf, codigoEmpresa, token));
    }
}
