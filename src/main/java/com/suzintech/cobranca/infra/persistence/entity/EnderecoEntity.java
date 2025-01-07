package com.suzintech.cobranca.infra.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class EnderecoEntity {

    @Column(name = "endereco_logradouro", length = 70)
    private String logradouro;

    @Column(name = "endereco_numero", length = 10)
    private String numero;

    @Column(name = "endereco_complemento", length = 40)
    private String complemento;

    @Column(name = "endereco_bairro", length = 70)
    private String bairro;

    @Column(name = "endereco_cidade", length = 70)
    private String cidade;

    @Column(name = "endereco_uf", length = 2)
    private String uf;

    @Column(name = "endereco_cep", length = 20)
    private String cep;
}
