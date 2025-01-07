CREATE TABLE IF NOT EXISTS `tb_empresa` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `razao_social` VARCHAR(70) NOT NULL,
  `cnpj` VARCHAR(20) NOT NULL,
  `endereco_logradouro` VARCHAR(70) NOT NULL,
  `endereco_numero` VARCHAR(10) NOT NULL,
  `endereco_cidade` VARCHAR(70) NOT NULL,
  `endereco_bairro` VARCHAR(70) NOT NULL,
  `endereco_complemento` VARCHAR(40) NULL,
  `endereco_uf` VARCHAR(2) NOT NULL,
  `endereco_cep` VARCHAR(20) NOT NULL,
  `dh_criacao` DATETIME NOT NULL,
  `dh_atualizacao` DATETIME NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB default charset = utf8;