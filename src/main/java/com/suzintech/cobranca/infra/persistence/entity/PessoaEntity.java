package com.suzintech.cobranca.infra.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_pessoa")
public class PessoaEntity extends BaseEntity {

    @Column(name = "nome", length = 80, nullable = false)
    private String nome;

    @Column(name = "documento", length = 20, nullable = false)
    private String documento;

    @Column(name = "pessoa_fisica")
    private boolean pessoaFisica;

    @Embedded
    private EnderecoEntity endereco;
}
