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
@Table(name = "tb_empresa")
public class EmpresaEntity extends BaseEntity {

    @Column(name = "razao_social", length = 70, nullable = false)
    private String razaoSocial;

    @Column(name = "cnpj", length = 20, nullable = false)
    private String cnpj;

    @Embedded
    private EnderecoEntity endereco;
}
