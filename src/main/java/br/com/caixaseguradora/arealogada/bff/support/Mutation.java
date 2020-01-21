package br.com.caixaseguradora.arealogada.bff.support;

import br.com.caixaseguradora.arealogada.bff.model.CreditoEmContaOutput;
import br.com.caixaseguradora.arealogada.bff.model.CreditoEmContaInput;
import br.com.caixaseguradora.arealogada.bff.previdencia.creditoemconta.CreditoEmContaClient;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import graphql.schema.DataFetchingEnvironment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    private static final Logger logger = LoggerFactory.getLogger(Mutation.class);

    private final CreditoEmContaClient creditoEmContaClient;

    @Autowired
    public Mutation(CreditoEmContaClient creditoEmContaClient) {
        this.creditoEmContaClient = creditoEmContaClient;
    }

    public CreditoEmContaOutput creditoEmConta(CreditoEmContaInput creditoEmContaInput, DataFetchingEnvironment env) {
        logger.info("creditoEmConta");

        return creditoEmContaClient.post(creditoEmContaInput, SecurityHelper.token(env));
    }

}
