<h1 align="center">
  <img alt="banner" title="banner" src="src/main/webapp/banner.png" />
</h1>

# :computer: livraria-online
O projeto *livraria-online* consiste em uma aplicação Web Java cujo objetivo é realizar a gestão de uma livraria online.

Este projeto foi desenvolvido no Módulo 1 do Bootcamp Java Alura 2021.

### :bookmark_tabs: Tabela de conteúdos
* [Status do projeto](#status)
* [Tecnologias](#tecnologias)
* [Features](#features)
* [Pré-requisitos](#requisitos)
* [Executando a aplicação](#executando)
* [Testando a aplicação](#testando)
* [Licença](#licenca)

<a name="status"/></a>
### :hourglass: Status do projeto
Concluído.

<a name="tecnologias"/></a>
### :hammer_and_wrench: Tecnologias

As seguintes tecnologias e ferramentas foram utilizadas no desenvolvimento deste projeto:

- [Java](https://www.oracle.com/java/)
- [Servlet](https://www.oracle.com/java/technologies/java-servlet-tec.html)
- [JSP (JavaServer Pages)](https://www.oracle.com/java/technologies/jspt.html)
- [JSTL (JavaServer Pages Standard Tag Library)](https://www.oracle.com/java/technologies/java-server-tag-library.html)
- [JDBC (Java Database Connectivity)](https://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/)
- [Bootstrap](https://getbootstrap.com/)
- [Maven](https://maven.apache.org/)
- [Tomcat](http://tomcat.apache.org/)
- [MySQL](https://www.mysql.com/)
- [Git](https://git-scm.com/)
- [Docker](https://www.docker.com/)

A aplicação foi desenvolvida na linguagem Java. A tecnologia Servlet foi utilizada para tratar as requisições HTTP. As páginas Web foram construídas com JSP/JSTL e estilizadas com os recursos do framework Bootstrap. O acesso ao banco de dados foi realizado por meio do JDBC. O Maven foi empregado para gerenciar a construção e as dependências da aplicação.

O controle de versão do código é realizado com o Git. A aplicação roda no servidor Tomcat e utiliza o banco de dados MySQL. O docker é empregado para criar os contêineres necessários para executar a aplicação.

<a name="features"/></a>
### :page_with_curl: Features
- [x] Cadastro de autores
- [x] Listagem de autores

<a name="requisitos"/></a>
### :pencil: Pré-requisitos

Antes de começar, você precisa ter instalado em sua máquina as seguintes ferramentas:
- [Git](https://git-scm.com/)
- [Docker](https://www.docker.com/)

<a name="executando"/></a>
### :rocket: Executando a aplicação

```bash
# Clone este repositório
$ git clone https://github.com/antonioeloy/livraria-online.git

# Execute os contêineres da aplicação
$ docker-compose up

# Acesse o seguinte endereço no navegador
$ http://localhost:8080/livraria/autores
```

<a name="testando"/></a>
### :gear: Testando a aplicação

A aplicação permite cadastrar um novo autor e listar os autores cadastrados, conforme imagem a seguir:

<h1 align="center">
  <img alt="tela" title="tela" src="src/main/webapp/tela.PNG" />
</h1>

<a name="licenca"/></a>
### :copyright: Licença

Este projeto está licenciado nos termos da licença MIT.
