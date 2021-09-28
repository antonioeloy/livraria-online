USE livraria;
CREATE TABLE `autores` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `nome` varchar(255),
  `email` varchar(255),
  `data_nascimento` date,
  `mini_curriculo` varchar(255)
);