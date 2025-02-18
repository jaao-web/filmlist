# Filmlist

Filmlist é uma aplicação backend desenvolvida em Java com Spring Boot que gerencia listas de filmes categorizados por gênero. A aplicação permite listar filmes por gênero, alterar a ordem dos filmes dentro de cada lista e persistir essas alterações em um banco de dados.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal utilizada no desenvolvimento da aplicação.
- **Spring Boot**: Framework que simplifica a criação de aplicações Java, proporcionando uma configuração padrão para projetos Spring.
- **Maven**: Ferramenta de automação de compilação e gerenciamento de dependências.
- **Banco de Dados**: Embora o tipo específico de banco de dados não tenha sido especificado, o Spring Boot oferece suporte a diversos bancos de dados relacionais e não relacionais.

## Funcionalidades

- **Listagem de Filmes por Gênero**: Recupera e exibe filmes agrupados por seus respectivos gêneros.
- **Reordenação de Filmes**: Permite alterar a ordem dos filmes dentro de cada gênero, com as mudanças sendo refletidas e armazenadas no banco de dados.

## Conhecimentos Aplicados

- **Desenvolvimento de API RESTful**: Criação de endpoints para operações de CRUD (Create, Read, Update, Delete) relacionadas às listas de filmes.
- **Persistência de Dados**: Utilização do Spring Data JPA para interagir com o banco de dados e gerenciar a persistência das informações.
- **Arquitetura em Camadas**: Implementação de uma estrutura organizada em camadas (Controller, Service, Repository) para promover a separação de responsabilidades e facilitar a manutenção do código.

## Como Executar o Projeto

1. **Pré-requisitos**:
   - Java 8 ou superior instalado.
   - Maven instalado.

2. **Clonar o Repositório**:
   ```bash
   git clone https://github.com/jaao-web/filmlist.git
   ```

3. **Navegar até o Diretório do Projeto**:
   ```bash
   cd filmlist
   ```

4. **Construir o Projeto**:
   ```bash
   mvn clean install
   ```

5. **Executar a Aplicação**:
   ```bash
   mvn spring-boot:run
   ```

Após a execução, a aplicação estará disponível em `http://localhost:8080/`.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

## Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo `LICENSE` para obter mais informações.

---

Para obter mais detalhes sobre a implementação e funcionalidades específicas, recomenda-se consultar o código-fonte e a documentação associada no repositório. 
