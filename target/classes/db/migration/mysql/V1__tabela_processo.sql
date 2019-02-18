CREATE TABLE `processo` (
  `id` bigint(20) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `data_atualizacao` datetime NOT NULL,
  `data_criacao` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `processo`
  ADD PRIMARY KEY (`id`);
  
ALTER TABLE `processo`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
