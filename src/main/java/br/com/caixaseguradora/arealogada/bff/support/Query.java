package br.com.caixaseguradora.arealogada.bff.support;

import br.com.caixaseguradora.arealogada.bff.canalpagamentodebito.CanalPagamentoDebitoClient;
import br.com.caixaseguradora.arealogada.bff.getcontratopessoa.ContratoClient;
import br.com.caixaseguradora.arealogada.bff.model.CanalPagamentoDebito;
import br.com.caixaseguradora.arealogada.bff.model.Contrato;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import graphql.schema.DataFetchingEnvironment;
import graphql.servlet.GraphQLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;

@Component
public class Query implements GraphQLQueryResolver {

    private final ContratoClient contratoClient;
    private final CanalPagamentoDebitoClient canalPagamentoDebitoClient;

    @Autowired
    public Query(ContratoClient contratoClient, CanalPagamentoDebitoClient canalPagamentoDebitoClient) {
        this.contratoClient = contratoClient;
        this.canalPagamentoDebitoClient = canalPagamentoDebitoClient;
    }

//    public Iterable<Contrato> getContratoPessoa(String cpf, String token) {
//        return Arrays.asList(contratoClient.getContratoPessoa(cpf, token));
//    }

//    public Iterable<CanalPagamentoDebito> getListaCanalPagamentoDebito(
//            String certificado, String cpf, String codigoEmpresa, String token) {
//        return Arrays.asList(this.canalPagamentoDebitoClient.get(certificado, cpf, codigoEmpresa, token));
//    }

    public Iterable<CanalPagamentoDebito> getListaCanalPagamentoDebito(
            String certificado, String cpf, String codigoEmpresa,
            DataFetchingEnvironment env) {
        return Arrays.asList(this.canalPagamentoDebitoClient.get(certificado, cpf, codigoEmpresa, SecurityHelper.token(env)));
    }
}
