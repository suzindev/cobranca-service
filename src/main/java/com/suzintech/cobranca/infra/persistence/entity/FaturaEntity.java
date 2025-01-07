package com.suzintech.cobranca.infra.persistence.entity;

import com.suzintech.cobranca.domain.SituacaoFatura;
import com.suzintech.cobranca.domain.TipoFatura;
import com.suzintech.cobranca.domain.TipoPagamento;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "tb_fatura")
public class FaturaEntity extends BaseEntity {

    @Column(name = "valor", precision = 10, scale = 2, nullable = false)
    private BigDecimal valor;

    @Column(name = "data_vencimento", nullable = false)
    private LocalDate dataVencimento;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", length = 30, nullable = false)
    private TipoFatura tipo;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_pagamento", length = 45, nullable = false)
    private TipoPagamento tipoPagamento;

    @Enumerated(EnumType.STRING)
    @Column(name = "situacao", length = 20, nullable = false)
    private SituacaoFatura situacao;

    @Column(name = "numero_documento", length = 20)
    private String numeroDocumento;

    @Column(name = "nosso_numero", length = 30)
    private String nossoNumero;

    @ManyToOne
    @JoinColumn(name = "id_conta", nullable = false)
    private ContaEntity conta;

    @ManyToOne
    @JoinColumn(name = "id_convenio", nullable = false)
    private ConvenioEntity convenio;

    @ManyToOne
    @JoinColumn(name = "id_pessoa", nullable = false)
    private PessoaEntity pessoa;
}
