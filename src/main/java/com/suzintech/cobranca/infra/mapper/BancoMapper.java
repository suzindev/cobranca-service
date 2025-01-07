package com.suzintech.cobranca.infra.mapper;

import com.suzintech.cobranca.domain.Banco;
import com.suzintech.cobranca.infra.controller.request.BancoRequest;
import com.suzintech.cobranca.infra.persistence.entity.BancoEntity;
import org.springframework.stereotype.Component;

@Component
public class BancoMapper {

    public BancoEntity toEntity(Banco dto) {
        var banco = new BancoEntity();
        banco.setId(dto.id());
        banco.setCriadoEm(dto.criadoEm());
        banco.setAtualizadoEm(dto.atualizadoEm());
        banco.setCodigo(dto.codigo());
        banco.setNome(dto.nome());

        return banco;
    }

    public Banco toDTO(BancoEntity entity) {
        return new Banco(
                entity.getId(),
                entity.getCriadoEm(),
                entity.getAtualizadoEm(),
                entity.getCodigo(),
                entity.getNome()
        );
    }

    public Banco toDTO(BancoRequest request) {
        return new Banco(
                request.codigo(),
                request.nome()
        );
    }
}
