package com.suzintech.cobranca.infra.persistence.entity;

import jakarta.persistence.Column;
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
@Table(name = "tb_banco")
public class BancoEntity extends BaseEntity {

    @Column(name = "codigo", length = 10, nullable = false)
    private String codigo;

    @Column(name = "nome", length = 60, nullable = false)
    private String nome;
}
