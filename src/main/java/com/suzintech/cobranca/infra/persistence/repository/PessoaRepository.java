package com.suzintech.cobranca.infra.persistence.repository;

import com.suzintech.cobranca.infra.persistence.entity.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {
}
