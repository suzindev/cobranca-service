package com.suzintech.cobranca.application.gateway;

import com.suzintech.cobranca.domain.Banco;

public interface AdicionarBancoGateway {

    Banco create(Banco obj);
}
