package br.com.caixaseguradora.arealogada.bff.model;

import java.util.List;

public class Contrato {

    //"$id": "789",
    //private String _id;

    //"id": null,
    private String id;

    // "desSegmento": "SEGURO DE AUTO",
    private String desSegmento ;

    // "numContrato": "1103101392967",
    private String numContrato;

    //"sistema": "SIAS",
    private String sistema;

    //"codCategoriaProduto": "",
    private String codCategoriaProduto;

    //"codProduto": "3173",
    private String codProduto;

    //"codProdutoBu": "3173",
    private String codProdutoBu;

    //"nomeProduto": "Caixa Seguro Auto Exclusivo",
    private String nomeProduto;

    //"nomeProdutoBu": "Caixa Seguro Auto Exclusivo",
    private String nomeProdutoBu;

    //"indContrato": "2",
    private String indContrato;

    //"situacaoContrato": "ATIVO",
    private String situacaoContrato;

    //"dataHoraIniVigencia": "2019-06-05 00:00:00",
    private String dataHoraIniVigencia;

    //"desDiretoria": "DIRID",
    private String desDiretoria;

    //"nomeTitularCartao": "",
    private String nomeTitularCartao;

    //"nomeTitularCobranca": "",
    private String nomeTitularCobranca;

    //"DataHoraInicioVigenciaFormatted": "05/06/2019",
    private String dataHoraInicioVigenciaFormatted;

    //"dataHoraFimVigencia": "2020-06-05 00:00:00",
    private String dataHoraFimVigencia;

    //"desModalidadeComtemplacao";
    private String desModalidadeComtemplacao;

    //"DataHoraFimVigenciaFormatted": "05/06/2020"
    private String dataHoraFimVigenciaFormatted;

    //"numApolice": "1103101392967",
    private String numApolice;

    //"endereco": null,
    private String endereco;

    //"coberturasContratadas": [],
    private List<String> coberturasContratadas;

    //"numCertificado": "0",
    private String numCertificado;

    //"nomePessoa": null,
    private String nomePessoa;

    //"saldo": null,
    private String saldo;

    //"numTitulo": "0",
    private String numTitulo;

    //"numDVCap": "",
    private String numDVCap;

    //"numPlano": "0",
    private String numPlano;

    //"numSerie": "0",
    private String numSerie;

    //"numModPlano": "0",
    private String numModPlano;

    //"codGrupo": "",
    private String codGrupo;

    //"codCota": "0",
    private String codCota;

    //"valorBem": "0",
    private String valorBem;

    //"valorBemContemplacao": "0",
    private String valorBemContemplacao;

    //"opcaoPagamento": "MENSAL",
    private String opcaoPagamento;

    //"formaPagamento": "BOLETO",
    private String formaPagamento;

    //"numParcContratadas": "4",
    private String numParcContratadas;

    //"valorImportanciaSegurada": null,
    private String valorImportanciaSegurada;

    //"DataUltimoSorteio": null,
    private String dataUltimoSorteio;

    //"DataAssembleia": null,
    private String dataAssembleia;

    // "tipoContrato": "CONTRATO",
    private String tipoContrato;

    // pessoasVinculadas
    private List<Pessoa> pessoasVinculadas;

    //"itemSegurado": "CIVIC SEDAN LXS 1.8/1.8 FLEX 16V AUT. 4P HONDA JGT-0",
    private String itemSegurado;

    //"numVersao": "0",
    private String numVersao;

    //"numSorteCap": "",
    private String numSorteCap;

    //"valor_saldo_provisao": null,
    private Double valor_saldo_provisao;

    //"saldo_liquido": null,
    private Double saldo_liquido;

    //"saldo_bruto": null,
    private Double saldo_bruto;

    //"assistenciasContratadas": [],
    private List<String> assistenciasContratadas;

    //"numProposta": "80630330160041"
    private String numProposta;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesSegmento() {
        return desSegmento;
    }

    public void setDesSegmento(String desSegmento) {
        this.desSegmento = desSegmento;
    }

    public String getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(String numContrato) {
        this.numContrato = numContrato;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getCodCategoriaProduto() {
        return codCategoriaProduto;
    }

    public void setCodCategoriaProduto(String codCategoriaProduto) {
        this.codCategoriaProduto = codCategoriaProduto;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public String getCodProdutoBu() {
        return codProdutoBu;
    }

    public void setCodProdutoBu(String codProdutoBu) {
        this.codProdutoBu = codProdutoBu;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getNomeProdutoBu() {
        return nomeProdutoBu;
    }

    public void setNomeProdutoBu(String nomeProdutoBu) {
        this.nomeProdutoBu = nomeProdutoBu;
    }

    public String getIndContrato() {
        return indContrato;
    }

    public void setIndContrato(String indContrato) {
        this.indContrato = indContrato;
    }

    public String getSituacaoContrato() {
        return situacaoContrato;
    }

    public void setSituacaoContrato(String situacaoContrato) {
        this.situacaoContrato = situacaoContrato;
    }

    public String getDataHoraIniVigencia() {
        return dataHoraIniVigencia;
    }

    public void setDataHoraIniVigencia(String dataHoraIniVigencia) {
        this.dataHoraIniVigencia = dataHoraIniVigencia;
    }

    public String getDesDiretoria() {
        return desDiretoria;
    }

    public void setDesDiretoria(String desDiretoria) {
        this.desDiretoria = desDiretoria;
    }

    public String getNomeTitularCartao() {
        return nomeTitularCartao;
    }

    public void setNomeTitularCartao(String nomeTitularCartao) {
        this.nomeTitularCartao = nomeTitularCartao;
    }

    public String getNomeTitularCobranca() {
        return nomeTitularCobranca;
    }

    public void setNomeTitularCobranca(String nomeTitularCobranca) {
        this.nomeTitularCobranca = nomeTitularCobranca;
    }

    public String getDataHoraInicioVigenciaFormatted() {
        return dataHoraInicioVigenciaFormatted;
    }

    public void setDataHoraInicioVigenciaFormatted(String dataHoraInicioVigenciaFormatted) {
        this.dataHoraInicioVigenciaFormatted = dataHoraInicioVigenciaFormatted;
    }

    public String getDataHoraFimVigencia() {
        return dataHoraFimVigencia;
    }

    public void setDataHoraFimVigencia(String dataHoraFimVigencia) {
        this.dataHoraFimVigencia = dataHoraFimVigencia;
    }

    public String getDesModalidadeComtemplacao() {
        return desModalidadeComtemplacao;
    }

    public void setDesModalidadeComtemplacao(String desModalidadeComtemplacao) {
        this.desModalidadeComtemplacao = desModalidadeComtemplacao;
    }

    public String getDataHoraFimVigenciaFormatted() {
        return dataHoraFimVigenciaFormatted;
    }

    public void setDataHoraFimVigenciaFormatted(String dataHoraFimVigenciaFormatted) {
        this.dataHoraFimVigenciaFormatted = dataHoraFimVigenciaFormatted;
    }

    public String getNumApolice() {
        return numApolice;
    }

    public void setNumApolice(String numApolice) {
        this.numApolice = numApolice;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumCertificado() {
        return numCertificado;
    }

    public void setNumCertificado(String numCertificado) {
        this.numCertificado = numCertificado;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getNumTitulo() {
        return numTitulo;
    }

    public void setNumTitulo(String numTitulo) {
        this.numTitulo = numTitulo;
    }

    public String getNumDVCap() {
        return numDVCap;
    }

    public void setNumDVCap(String numDVCap) {
        this.numDVCap = numDVCap;
    }

    public String getNumPlano() {
        return numPlano;
    }

    public void setNumPlano(String numPlano) {
        this.numPlano = numPlano;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getNumModPlano() {
        return numModPlano;
    }

    public void setNumModPlano(String numModPlano) {
        this.numModPlano = numModPlano;
    }

    public String getCodGrupo() {
        return codGrupo;
    }

    public void setCodGrupo(String codGrupo) {
        this.codGrupo = codGrupo;
    }

    public String getCodCota() {
        return codCota;
    }

    public void setCodCota(String codCota) {
        this.codCota = codCota;
    }

    public String getValorBem() {
        return valorBem;
    }

    public void setValorBem(String valorBem) {
        this.valorBem = valorBem;
    }

    public String getValorBemContemplacao() {
        return valorBemContemplacao;
    }

    public void setValorBemContemplacao(String valorBemContemplacao) {
        this.valorBemContemplacao = valorBemContemplacao;
    }

    public String getOpcaoPagamento() {
        return opcaoPagamento;
    }

    public void setOpcaoPagamento(String opcaoPagamento) {
        this.opcaoPagamento = opcaoPagamento;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getNumParcContratadas() {
        return numParcContratadas;
    }

    public void setNumParcContratadas(String numParcContratadas) {
        this.numParcContratadas = numParcContratadas;
    }

    public String getValorImportanciaSegurada() {
        return valorImportanciaSegurada;
    }

    public void setValorImportanciaSegurada(String valorImportanciaSegurada) {
        this.valorImportanciaSegurada = valorImportanciaSegurada;
    }

    public String getDataUltimoSorteio() {
        return dataUltimoSorteio;
    }

    public void setDataUltimoSorteio(String dataUltimoSorteio) {
        this.dataUltimoSorteio = dataUltimoSorteio;
    }

    public String getDataAssembleia() {
        return dataAssembleia;
    }

    public void setDataAssembleia(String dataAssembleia) {
        this.dataAssembleia = dataAssembleia;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public List<Pessoa> getPessoasVinculadas() {
        return pessoasVinculadas;
    }

    public void setPessoasVinculadas(List<Pessoa> pessoasVinculadas) {
        this.pessoasVinculadas = pessoasVinculadas;
    }

    public String getItemSegurado() {
        return itemSegurado;
    }

    public void setItemSegurado(String itemSegurado) {
        this.itemSegurado = itemSegurado;
    }

    public String getNumVersao() {
        return numVersao;
    }

    public void setNumVersao(String numVersao) {
        this.numVersao = numVersao;
    }

    public String getNumSorteCap() {
        return numSorteCap;
    }

    public void setNumSorteCap(String numSorteCap) {
        this.numSorteCap = numSorteCap;
    }

    public Double getValor_saldo_provisao() {
        return valor_saldo_provisao;
    }

    public void setValor_saldo_provisao(Double valor_saldo_provisao) {
        this.valor_saldo_provisao = valor_saldo_provisao;
    }

    public Double getSaldo_liquido() {
        return saldo_liquido;
    }

    public void setSaldo_liquido(Double saldo_liquido) {
        this.saldo_liquido = saldo_liquido;
    }

    public Double getSaldo_bruto() {
        return saldo_bruto;
    }

    public void setSaldo_bruto(Double saldo_bruto) {
        this.saldo_bruto = saldo_bruto;
    }

    public String getNumProposta() {
        return numProposta;
    }

    public void setNumProposta(String numProposta) {
        this.numProposta = numProposta;
    }

    public List<String> getCoberturasContratadas() {
        return coberturasContratadas;
    }

    public void setCoberturasContratadas(List<String> coberturasContratadas) {
        this.coberturasContratadas = coberturasContratadas;
    }

    public List<String> getAssistenciasContratadas() {
        return assistenciasContratadas;
    }

    public void setAssistenciasContratadas(List<String> assistenciasContratadas) {
        this.assistenciasContratadas = assistenciasContratadas;
    }
}
