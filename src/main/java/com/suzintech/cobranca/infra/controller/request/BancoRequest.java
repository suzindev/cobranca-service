package com.suzintech.cobranca.infra.controller.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record BancoRequest(
        @NotBlank(message = "Este campo é obrigatório")
        @Size(max = 10, message = "O valor máximo permitido é {max} caracteres")
        String codigo,

        @NotBlank(message = "Este campo é obrigatório")
        @Size(max = 60, message = "O valor máximo permitido é {max} caracteres")
        String nome
) {
}
