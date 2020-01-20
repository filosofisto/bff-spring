package br.com.caixaseguradora.arealogada.bff.canalpagamentodebito;

import br.com.caixaseguradora.arealogada.bff.model.CanalPagamentoDebito;

public class ListaCanalPagamentoDebito {

    private CanalPagamentoDebito[] lista_canais_pagamento_debito;

    public CanalPagamentoDebito[] getLista_canais_pagamento_debito() {
        return lista_canais_pagamento_debito;
    }

    public void setLista_canais_pagamento_debito(CanalPagamentoDebito[] lista_canais_pagamento_debito) {
        this.lista_canais_pagamento_debito = lista_canais_pagamento_debito;
    }
}
