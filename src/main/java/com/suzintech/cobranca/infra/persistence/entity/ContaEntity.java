package com.suzintech.cobranca.infra.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_conta")
public class ContaEntity extends BaseEntity {

    @Column(name = "agencia")
    private String agencia;

    @Column(name = "conta")
    private String conta;

    @Column(name = "digito_agencia")
    private String digitoAgencia;

    @Column(name = "digito_conta")
    private String digitoConta;

    @ManyToOne
    @JoinColumn(name = "id_banco")
    private BancoEntity banco;

    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private EmpresaEntity empresa;
}
