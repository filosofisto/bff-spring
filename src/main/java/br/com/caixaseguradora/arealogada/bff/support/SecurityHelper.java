package br.com.caixaseguradora.arealogada.bff.support;

import graphql.schema.DataFetchingEnvironment;
import graphql.servlet.GraphQLContext;

import javax.servlet.http.HttpServletRequest;

public final class SecurityHelper {

    public static String token(DataFetchingEnvironment env) {
        GraphQLContext context =  env.getContext();
        HttpServletRequest request = context.getHttpServletRequest().get();

        String bearerToken = request.getHeader("Authorization");

        if (bearerToken == null) {
            throw new RuntimeException("no bearer token found");
        }

        if (!bearerToken.startsWith("Bearer")) {
            throw new RuntimeException("strange bearer token");
        }

        return bearerToken.substring(7);
    }
}
