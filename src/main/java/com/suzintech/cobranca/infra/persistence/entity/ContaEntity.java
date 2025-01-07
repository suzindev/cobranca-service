package com.suzintech.cobranca.infra.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_conta")
public class ContaEntity extends BaseEntity {

    @Column(name = "agencia", length = 10, nullable = false)
    private String agencia;

    @Column(name = "conta", length = 15, nullable = false)
    private String conta;

    @Column(name = "digito_agencia", length = 1)
    private String digitoAgencia;

    @Column(name = "digito_conta", length = 1, nullable = false)
    private String digitoConta;

    @ManyToOne
    @JoinColumn(name = "id_banco", nullable = false)
    private BancoEntity banco;

    @ManyToOne
    @JoinColumn(name = "id_empresa", nullable = false)
    private EmpresaEntity empresa;
}
