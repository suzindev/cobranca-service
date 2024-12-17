package com.suzintech.cobranca.domain;

import java.time.LocalDateTime;

public record Pessoa(
        Long id,
        LocalDateTime criadoEm,
        LocalDateTime atualizadoEm,
        String nome,
        String documento,
        boolean pessoaFisica,
        Endereco endereco
) {
}
