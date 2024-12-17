package com.suzintech.cobranca.infra.service;

import com.suzintech.cobranca.application.gateway.PessoaGateway;
import com.suzintech.cobranca.domain.Pessoa;
import com.suzintech.cobranca.exception.ObjectNotFoundException;
import com.suzintech.cobranca.infra.mapper.PessoaMapper;
import com.suzintech.cobranca.infra.persistence.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PessoaService implements PessoaGateway {

    private final PessoaRepository pessoaRepository;

    private final PessoaMapper pessoaMapper;

    @Override
    public List<Pessoa> buscarRegistros() {
        try {
            return pessoaRepository.findAll().stream()
                    .map(pessoaMapper::toDTO)
                    .toList();
        } catch (Exception e) {
            throw new ObjectNotFoundException(e.getMessage());
        }
    }
}
