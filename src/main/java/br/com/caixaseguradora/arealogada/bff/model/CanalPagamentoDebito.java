package br.com.caixaseguradora.arealogada.bff.model;

public class CanalPagamentoDebito {

//    "codigo_tipo_pagamento": "5",
    private String codigo_tipo_pagamento;
//    "descricao_pagamento": "DEBITO CC",
    private String descricao_pagamento;
//    "codigo_canal_arrecadacao": 1053343,
    private String codigo_canal_arrecadacao;
//    "metodo_pagamento": "CB",
    private String metodo_pagamento;
//    "tipo_conta_bancaria": "CC",
    private String tipo_conta_bancaria;
//    "numero_banco": "104",
    private String numero_banco;
//    "nome_banco": "CAIXA ECONOMICA FEDERAL",
    private String nome_banco;
//    "numero_agencia": "0533",
    private String numero_agencia;
//    "digito_agencia": "",
    private String digito_agencia;
//    "numero_conta": "00100205320",
    private String numero_conta;
//    "digito_conta": "5",
    private String digito_conta;
//    "indicador_obrigatorio_agencia": false,
    private boolean indicador_obrigatorio_agencia;
//    "indicador_obrigatorio_conta": false,
    private boolean indicador_obrigatorio_conta;
//    "indicador_pagamento_inicial": false
    private boolean indicador_pagamento_inicial;

    public String getCodigo_tipo_pagamento() {
        return codigo_tipo_pagamento;
    }

    public void setCodigo_tipo_pagamento(String codigo_tipo_pagamento) {
        this.codigo_tipo_pagamento = codigo_tipo_pagamento;
    }

    public String getDescricao_pagamento() {
        return descricao_pagamento;
    }

    public void setDescricao_pagamento(String descricao_pagamento) {
        this.descricao_pagamento = descricao_pagamento;
    }

    public String getCodigo_canal_arrecadacao() {
        return codigo_canal_arrecadacao;
    }

    public void setCodigo_canal_arrecadacao(String codigo_canal_arrecadacao) {
        this.codigo_canal_arrecadacao = codigo_canal_arrecadacao;
    }

    public String getMetodo_pagamento() {
        return metodo_pagamento;
    }

    public void setMetodo_pagamento(String metodo_pagamento) {
        this.metodo_pagamento = metodo_pagamento;
    }

    public String getTipo_conta_bancaria() {
        return tipo_conta_bancaria;
    }

    public void setTipo_conta_bancaria(String tipo_conta_bancaria) {
        this.tipo_conta_bancaria = tipo_conta_bancaria;
    }

    public String getNumero_banco() {
        return numero_banco;
    }

    public void setNumero_banco(String numero_banco) {
        this.numero_banco = numero_banco;
    }

    public String getNome_banco() {
        return nome_banco;
    }

    public void setNome_banco(String nome_banco) {
        this.nome_banco = nome_banco;
    }

    public String getNumero_agencia() {
        return numero_agencia;
    }

    public void setNumero_agencia(String numero_agencia) {
        this.numero_agencia = numero_agencia;
    }

    public String getDigito_agencia() {
        return digito_agencia;
    }

    public void setDigito_agencia(String digito_agencia) {
        this.digito_agencia = digito_agencia;
    }

    public String getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(String numero_conta) {
        this.numero_conta = numero_conta;
    }

    public String getDigito_conta() {
        return digito_conta;
    }

    public void setDigito_conta(String digito_conta) {
        this.digito_conta = digito_conta;
    }

    public boolean isIndicador_obrigatorio_agencia() {
        return indicador_obrigatorio_agencia;
    }

    public void setIndicador_obrigatorio_agencia(boolean indicador_obrigatorio_agencia) {
        this.indicador_obrigatorio_agencia = indicador_obrigatorio_agencia;
    }

    public boolean isIndicador_obrigatorio_conta() {
        return indicador_obrigatorio_conta;
    }

    public void setIndicador_obrigatorio_conta(boolean indicador_obrigatorio_conta) {
        this.indicador_obrigatorio_conta = indicador_obrigatorio_conta;
    }

    public boolean isIndicador_pagamento_inicial() {
        return indicador_pagamento_inicial;
    }

    public void setIndicador_pagamento_inicial(boolean indicador_pagamento_inicial) {
        this.indicador_pagamento_inicial = indicador_pagamento_inicial;
    }
}
