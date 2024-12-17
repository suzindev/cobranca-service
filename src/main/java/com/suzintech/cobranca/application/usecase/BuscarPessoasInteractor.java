package com.suzintech.cobranca.application.usecase;

import com.suzintech.cobranca.application.gateway.PessoaGateway;
import com.suzintech.cobranca.domain.Pessoa;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class BuscarPessoasInteractor {

    private final PessoaGateway gateway;

    public List<Pessoa> execute() {
        return gateway.buscarRegistros();
    }
}
