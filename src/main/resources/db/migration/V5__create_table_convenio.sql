CREATE TABLE IF NOT EXISTS `tb_convenio` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `id_conta` BIGINT UNSIGNED NOT NULL,
  `numero_contrato` VARCHAR(30) NOT NULL,
  `carteira` VARCHAR(5) NOT NULL,
  `variacao_carteira` VARCHAR(5) NULL,
  `juros_porcentagem` DECIMAL(10,2) NULL,
  `multa_porcentagem` DECIMAL(10,2) NULL,
  `dh_criacao` DATETIME NOT NULL,
  `dh_atualizacao` DATETIME NULL,
  PRIMARY KEY (`id`),
  INDEX `idx_convenio_conta` (`id_conta` ASC),
  CONSTRAINT `fk_convenio_conta`
    FOREIGN KEY (`id_conta`)
    REFERENCES `tb_conta` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB default charset = utf8;