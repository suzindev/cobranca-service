package com.suzintech.cobranca.infra.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_pessoa")
public class PessoaEntity extends BaseEntity {

    @Column(name = "nome")
    private String nome;

    @Column(name = "documento")
    private String documento;

    @Column(name = "pessoa_fisica")
    private boolean pessoaFisica;

    @Embedded
    private EnderecoEntity endereco;
}
