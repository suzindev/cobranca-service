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

    @Column(name = "valor")
    private BigDecimal valor;

    @Column(name = "data_vencimento")
    private LocalDate dataVencimento;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private TipoFatura tipo;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_pagamento")
    private TipoPagamento tipoPagamento;

    @Enumerated(EnumType.STRING)
    @Column(name = "situacao")
    private SituacaoFatura situacao;

    @Column(name = "numero_documento")
    private String numeroDocumento;

    @Column(name = "nosso_numero")
    private String nossoNumero;

    @ManyToOne
    @JoinColumn(name = "id_conta")
    private ContaEntity conta;

    @ManyToOne
    @JoinColumn(name = "id_convenio")
    private ConvenioEntity convenio;

    @ManyToOne
    @JoinColumn(name = "id_pessoa")
    private PessoaEntity pessoa;
}
