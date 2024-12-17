package com.suzintech.cobranca.infra.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "tb_convenio")
public class ConvenioEntity extends BaseEntity {

    @Column(name = "numero_contrato")
    private String numeroContrato;

    @Column(name = "carteira")
    private String carteira;

    @Column(name = "variacao_carteira")
    private String variacaoCarteira;

    @Column(name = "juros_porcentagem")
    private BigDecimal jurosPorcentagem;

    @Column(name = "multa_porcentagem")
    private BigDecimal multaPorcentagem;

    @ManyToOne
    @JoinColumn(name = "id_conta")
    private ContaEntity conta;
}
