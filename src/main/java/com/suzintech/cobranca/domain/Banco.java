package com.suzintech.cobranca.domain;

import java.time.LocalDateTime;

public record Banco(
        Long id,
        LocalDateTime criadoEm,
        LocalDateTime atualizadoEm,
        String codigo,
        String nome
) {
    public Banco(String codigo, String nome) {
        this(null, null, null, codigo, nome);
    }
}
