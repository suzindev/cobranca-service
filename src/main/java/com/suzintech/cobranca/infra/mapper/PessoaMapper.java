package com.suzintech.cobranca.infra.mapper;

import com.suzintech.cobranca.domain.Endereco;
import com.suzintech.cobranca.domain.Pessoa;
import com.suzintech.cobranca.infra.persistence.entity.EnderecoEntity;
import com.suzintech.cobranca.infra.persistence.entity.PessoaEntity;
import org.springframework.stereotype.Component;

import java.util.Objects;

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
                Objects.nonNull(entity.getEndereco()) ?
                        new Endereco(
                                entity.getEndereco().getLogradouro(),
                                entity.getEndereco().getNumero(),
                                entity.getEndereco().getComplemento(),
                                entity.getEndereco().getBairro(),
                                entity.getEndereco().getCidade(),
                                entity.getEndereco().getUf(),
                                entity.getEndereco().getCep()
                        ) : null
        );
    }

    public PessoaEntity toEntity(Pessoa dto) {
        var pessoa = new PessoaEntity();
        pessoa.setId(dto.id());
        pessoa.setCriadoEm(dto.criadoEm());
        pessoa.setAtualizadoEm(dto.atualizadoEm());
        pessoa.setNome(dto.nome());
        pessoa.setDocumento(dto.documento());
        pessoa.setPessoaFisica(dto.pessoaFisica());

        var endereco = new EnderecoEntity();
        if (Objects.nonNull(dto.endereco())) {
            endereco.setLogradouro(dto.endereco().logradouro());
            endereco.setNumero(dto.endereco().numero());
            endereco.setComplemento(dto.endereco().complemento());
            endereco.setBairro(dto.endereco().bairro());
            endereco.setCidade(dto.endereco().cidade());
            endereco.setUf(dto.endereco().uf());
            endereco.setCep(dto.endereco().cep());
        }

        pessoa.setEndereco(endereco);

        return pessoa;
    }
}
