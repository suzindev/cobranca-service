CREATE TABLE IF NOT EXISTS `tb_pessoa` (
    `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    `dh_criacao` DATETIME NOT NULL,
    `dh_atualizacao` DATETIME NULL,
    `nome` VARCHAR(80) NOT NULL,
    `documento` VARCHAR(20) NOT NULL,
    `pessoa_fisica` TINYINT NOT NULL DEFAULT 0,
    `endereco_logradouro` VARCHAR(70) NULL,
    `endereco_numero` VARCHAR(10) NULL,
    `endereco_complemento` VARCHAR(40) NULL,
    `endereco_bairro` VARCHAR(70) NULL,
    `endereco_cidade` VARCHAR(70) NULL,
    `endereco_uf` VARCHAR(2) NULL,
    `endereco_cep` VARCHAR(20) NULL,
    PRIMARY KEY (`id`))
ENGINE = InnoDB default charset = utf8;