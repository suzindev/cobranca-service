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

    @Column(name = "numero_contrato", length = 30, nullable = false)
    private String numeroContrato;

    @Column(name = "carteira", length = 5, nullable = false)
    private String carteira;

    @Column(name = "variacao_carteira", length = 5)
    private String variacaoCarteira;

    @Column(name = "juros_porcentagem", precision = 10, scale = 2)
    private BigDecimal jurosPorcentagem;

    @Column(name = "multa_porcentagem", precision = 10, scale = 2)
    private BigDecimal multaPorcentagem;

    @ManyToOne
    @JoinColumn(name = "id_conta", nullable = false)
    private ContaEntity conta;
}
