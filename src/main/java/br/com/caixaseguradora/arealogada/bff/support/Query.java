package br.com.caixaseguradora.arealogada.bff.support;

import br.com.caixaseguradora.arealogada.bff.canalpagamentodebito.CanalPagamentoDebitoClient;
import br.com.caixaseguradora.arealogada.bff.getcontratopessoa.ContratoClient;
import br.com.caixaseguradora.arealogada.bff.model.CanalPagamentoDebito;
import br.com.caixaseguradora.arealogada.bff.model.Contrato;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Query implements GraphQLQueryResolver {

    private final ContratoClient contratoClient;
    private final CanalPagamentoDebitoClient canalPagamentoDebitoClient;

    @Autowired
    public Query(ContratoClient contratoClient, CanalPagamentoDebitoClient canalPagamentoDebitoClient) {
        this.contratoClient = contratoClient;
        this.canalPagamentoDebitoClient = canalPagamentoDebitoClient;
    }

    public Iterable<Contrato> getContratoPessoa(String cpf, DataFetchingEnvironment env) {
        return Arrays.asList(contratoClient.getContratoPessoa(cpf, SecurityHelper.token(env)));
    }

    public Iterable<CanalPagamentoDebito> getListaCanalPagamentoDebito(
            String certificado, String cpf, String codigoEmpresa,
            DataFetchingEnvironment env) {
        return Arrays.asList(
                this.canalPagamentoDebitoClient.get(certificado, cpf, codigoEmpresa, SecurityHelper.token(env))
        );
    }
}
