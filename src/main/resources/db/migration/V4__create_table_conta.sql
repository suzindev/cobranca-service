CREATE TABLE IF NOT EXISTS `tb_conta` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `id_empresa` BIGINT UNSIGNED NOT NULL,
  `agencia` VARCHAR(10) NOT NULL,
  `conta` VARCHAR(15) NOT NULL,
  `digito_agencia` VARCHAR(1) NULL,
  `digito_conta` VARCHAR(1) NOT NULL,
  `id_banco` BIGINT UNSIGNED NOT NULL,
  `dh_criacao` DATETIME NOT NULL,
  `dh_atualizacao` DATETIME NULL,
  PRIMARY KEY (`id`),
  INDEX `idx_conta_empresa` (`id_empresa` ASC),
  INDEX `idx_conta_banco` (`id_banco` ASC),
  CONSTRAINT `fk_conta_empresa`
    FOREIGN KEY (`id_empresa`)
    REFERENCES `tb_empresa` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_conta_banco`
    FOREIGN KEY (`id_banco`)
    REFERENCES `tb_banco` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB default charset = utf8;