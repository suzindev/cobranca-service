package com.suzintech.cobranca.infra.persistence.repository;

import com.suzintech.cobranca.infra.persistence.entity.BancoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BancoRepository extends JpaRepository<BancoEntity, Long> {
}
