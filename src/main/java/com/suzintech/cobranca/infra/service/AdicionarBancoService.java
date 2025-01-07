package com.suzintech.cobranca.infra.service;

import com.suzintech.cobranca.application.gateway.AdicionarBancoGateway;
import com.suzintech.cobranca.domain.Banco;
import com.suzintech.cobranca.exception.CrudException;
import com.suzintech.cobranca.infra.mapper.BancoMapper;
import com.suzintech.cobranca.infra.persistence.repository.BancoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdicionarBancoService implements AdicionarBancoGateway {

    private final BancoRepository bancoRepository;

    private final BancoMapper bancoMapper;

    @Override
    public Banco create(Banco obj) {
        try {
            var banco = bancoRepository.save(bancoMapper.toEntity(obj));

            return bancoMapper.toDTO(banco);
        } catch (Exception e) {
            throw new CrudException(e.getMessage());
        }
    }
}
