CREATE TABLE `categorias` (
  `id` bigint(20) NOT NULL auto_increment,
  `data_atualizacao` datetime DEFAULT NULL,
  `data_criacao` datetime DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `filmes` (
  `id` bigint(20) NOT NULL auto_increment,
  `data_atualizacao` datetime DEFAULT NULL,
  `data_criacao` datetime DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `diretor` varchar(255) DEFAULT NULL,
  `lancamento` date DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `categoria_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKl9m06bihaqsxsf8sh606caxkl` (`categoria_id`)
);
