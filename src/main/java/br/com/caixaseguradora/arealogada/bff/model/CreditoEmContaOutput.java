package br.com.caixaseguradora.arealogada.bff.model;

import java.util.List;

public class CreditoEmContaOutput {

    private String numFatura;
    private String status;
    private List<String> lstMensagem;

    public String getNumFatura() {
        return numFatura;
    }

    public void setNumFatura(String numFatura) {
        this.numFatura = numFatura;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getLstMensagem() {
        return lstMensagem;
    }

    public void setLstMensagem(List<String> lstMensagem) {
        this.lstMensagem = lstMensagem;
    }
}
