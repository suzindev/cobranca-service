package com.suzintech.cobranca.infra.mapper;

import com.suzintech.cobranca.domain.Endereco;
import com.suzintech.cobranca.domain.Pessoa;
import com.suzintech.cobranca.infra.persistence.entity.PessoaEntity;
import org.springframework.stereotype.Component;

@Component
public class PessoaMapper {

    public Pessoa toDTO(PessoaEntity entity) {
        return new Pessoa(
                entity.getId(),
                entity.getCriadoEm(),
                entity.getAtualizadoEm(),
                entity.getNome(),
                entity.getDocumento(),
                entity.isPessoaFisica(),
                new Endereco(
                        entity.getEndereco().getLogradouro(),
                        entity.getEndereco().getNumero(),
                        entity.getEndereco().getComplemento(),
                        entity.getEndereco().getBairro(),
                        entity.getEndereco().getCidade(),
                        entity.getEndereco().getUf(),
                        entity.getEndereco().getCep()
                )
        );
    }
}
