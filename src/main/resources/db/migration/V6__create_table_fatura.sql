CREATE TABLE IF NOT EXISTS `tb_fatura` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `valor` DECIMAL(10,2) NOT NULL,
  `data_vencimento` DATETIME NOT NULL,
  `tipo` VARCHAR(30) NOT NULL,
  `situacao` VARCHAR(20) NOT NULL,
  `numero_documento` VARCHAR(20) NULL,
  `nosso_numero` VARCHAR(30) NULL,
  `tipo_pagamento` VARCHAR(45) NOT NULL,
  `id_conta` BIGINT UNSIGNED NOT NULL,
  `id_convenio` BIGINT UNSIGNED NOT NULL,
  `id_pessoa` BIGINT UNSIGNED NOT NULL,
  `dh_criacao` DATETIME NOT NULL,
  `dh_atualizacao` DATETIME NULL,
  PRIMARY KEY (`id`),
  INDEX `idx_fatura_conta` (`id_conta` ASC),
  INDEX `idx_fatura_convenio` (`id_convenio` ASC),
  INDEX `idx_fatura_pessoa` (`id_pessoa` ASC),
  CONSTRAINT `fk_fatura_conta`
    FOREIGN KEY (`id_conta`)
    REFERENCES `tb_conta` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_fatura_convenio`
    FOREIGN KEY (`id_convenio`)
    REFERENCES `tb_convenio` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_fatura_pessoa`
    FOREIGN KEY (`id_pessoa`)
    REFERENCES `tb_pessoa` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB default charset = utf8;