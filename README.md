# Menu API

API REST desenvolvida em Java com Spring Boot para gerenciar itens do cardápio de um restaurante ou estabelecimento.

A aplicação permite consultar, criar e remover registros de alimentos, armazenando as informações em um banco PostgreSQL.

## Funcionalidades

- Listagem de todos os itens do cardápio
- Busca de um item por identificador
- Cadastro de novos alimentos
- Exclusão de itens existentes

## Stack tecnológica

- Java 17
- Spring Boot 3
- Spring Web MVC
- Spring Data JPA
- PostgreSQL
- Maven

## Estrutura do projeto

- `controller`: endpoints da API
- `service`: regras de negócio
- `repository`: acesso ao banco de dados
- `model`: entidades JPA
- `dto`: objetos de transferência de dados

## Executando localmente

1. Configure as variáveis de ambiente do PostgreSQL:
   - `POSTGRES_DB`
   - `POSTGRES_USERNAME`
   - `POSTGRES_PASSWORD`
2. Inicie o banco PostgreSQL localmente.
3. Execute a aplicação:

```bash
./mvnw spring-boot:run
```

A API ficará disponível em `http://localhost:8080`.

## Endpoints principais

- `GET /foods` — lista todos os itens
- `GET /foods/{id}` — busca um item por ID
- `POST /foods` — cria um novo item
- `DELETE /foods/{id}` — remove um item

## Observação

Este projeto foi criado como uma API simples para gerenciamento de menu, servindo como base para aplicações backend com persistência em banco relacional.
