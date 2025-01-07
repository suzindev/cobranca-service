CREATE TABLE IF NOT EXISTS `tb_banco` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `codigo` VARCHAR(10) NOT NULL,
  `nome` VARCHAR(60) NOT NULL,
  `dh_criacao` DATETIME NOT NULL,
  `dh_atualizacao` DATETIME NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB default charset = utf8;