package br.com.caixaseguradora.arealogada.bff.model;

public class CreditoEmContaInput {

    private String certificado;
    private String codigo_empresa;
    private String data_pagamento;
    private String metodo_pagamento;
    private String codigo_tipo_pagamento;
    private Integer codigo_canal_recuperacao;
    private String descricao_pagamento;
    private Float valor_contribuicao;
    private boolean indicativo_imprimir_fatura;
    private String tipo_conta;
    private String numero_banco;
    private String nome_banco;
    private String numero_agencia;
    private String numero_digito_agencia;
    private String numero_conta;
    private String numero_digito_conta;

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public String getCodigo_empresa() {
        return codigo_empresa;
    }

    public void setCodigo_empresa(String codigo_empresa) {
        this.codigo_empresa = codigo_empresa;
    }

    public String getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(String data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public String getMetodo_pagamento() {
        return metodo_pagamento;
    }

    public void setMetodo_pagamento(String metodo_pagamento) {
        this.metodo_pagamento = metodo_pagamento;
    }

    public String getCodigo_tipo_pagamento() {
        return codigo_tipo_pagamento;
    }

    public void setCodigo_tipo_pagamento(String codigo_tipo_pagamento) {
        this.codigo_tipo_pagamento = codigo_tipo_pagamento;
    }

    public Integer getCodigo_canal_recuperacao() {
        return codigo_canal_recuperacao;
    }

    public void setCodigo_canal_recuperacao(Integer codigo_canal_recuperacao) {
        this.codigo_canal_recuperacao = codigo_canal_recuperacao;
    }

    public String getDescricao_pagamento() {
        return descricao_pagamento;
    }

    public void setDescricao_pagamento(String descricao_pagamento) {
        this.descricao_pagamento = descricao_pagamento;
    }

    public Float getValor_contribuicao() {
        return valor_contribuicao;
    }

    public void setValor_contribuicao(Float valor_contribuicao) {
        this.valor_contribuicao = valor_contribuicao;
    }

    public boolean isIndicativo_imprimir_fatura() {
        return indicativo_imprimir_fatura;
    }

    public void setIndicativo_imprimir_fatura(boolean indicativo_imprimir_fatura) {
        this.indicativo_imprimir_fatura = indicativo_imprimir_fatura;
    }

    public String getTipo_conta() {
        return tipo_conta;
    }

    public void setTipo_conta(String tipo_conta) {
        this.tipo_conta = tipo_conta;
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

    public String getNumero_digito_agencia() {
        return numero_digito_agencia;
    }

    public void setNumero_digito_agencia(String numero_digito_agencia) {
        this.numero_digito_agencia = numero_digito_agencia;
    }

    public String getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(String numero_conta) {
        this.numero_conta = numero_conta;
    }

    public String getNumero_digito_conta() {
        return numero_digito_conta;
    }

    public void setNumero_digito_conta(String numero_digito_conta) {
        this.numero_digito_conta = numero_digito_conta;
    }
}
