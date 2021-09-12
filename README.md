# livraria-online
Projeto de uma aplicação Web em Java para gestão de uma livraria online desenvolvido no Bootcamp Java 2021 da Alura.

## Módulo 1

No Módulo 1 do Bootcamp, a aplicação Web Java foi desenvolvida com as funcionalidades para cadastrar um autor e para listar os autores cadastrados. As seguintes tecnologias foram utilizadas:

- **Servlet** -> para tratamento de requisições HTTP;
- **JDBC (Java Database Connectivity)** -> para conexão com o banco de dados;
- **JSP (JavaServer Pages) e JSTL (JavaServer Pages Standard Tag Library)** -> para criação da página contendo o formulário de cadastro de um autor e a lista de autores cadastrados;
- **Bootstrap** -> para estilizar a página JSP.

Nesta primeira versão da aplicação, as principais classes criadas foram:

- _Autor_ -> contém as principais informações para representar um autor;
- _AutorDao_ -> contém os métodos para realizar operações no banco de dados, como cadastrar um autor e listar todos os autores cadastrados;
- _ConnectionFactory_ -> para estabelecer uma conexão com o banco de dados;
- _AutoresServlet_ -> para lidar com as requisições HTTP (_GET_ e _POST_).

O projeto foi desenvolvido utilizando a versão 15 do Java. O servidor de aplicação empregado foi o _Apache Tomcat 9_ e o banco de dados escolhido foi o _MySQL 8.0_.

Para criar a tabela _autores_, o seguinte comando SQL foi executado:

```
CREATE TABLE `autores` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `nome` varchar(255),
  `email` varchar(255),
  `data_nascimento` date,
  `mini_curriculo` varchar(255)
);
```
