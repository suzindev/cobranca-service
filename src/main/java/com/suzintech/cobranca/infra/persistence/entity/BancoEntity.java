package com.suzintech.cobranca.infra.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_banco")
public class BancoEntity extends BaseEntity {

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "nome")
    private String nome;
}
