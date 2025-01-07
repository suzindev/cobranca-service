package com.suzintech.cobranca.application.usecase;

import com.suzintech.cobranca.application.gateway.AdicionarBancoGateway;
import com.suzintech.cobranca.domain.Banco;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AdicionarBancoInteractor {

    private final AdicionarBancoGateway gateway;

    public Banco execute(Banco obj) {
        return gateway.create(obj);
    }
}
