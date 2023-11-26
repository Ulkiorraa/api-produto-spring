# API REST de Produtos

Este projeto é uma API REST para a gestão de produtos. Ele permite operações CRUD (Criar, Ler, Atualizar, Deletar) em produtos. A API foi desenvolvida usando Java com Spring Framework e utiliza o H2 Database para persistência de dados.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Lombok
- Spring Data JPA
- H2 Database
- Maven

## Configuração e Execução

Para configurar e executar este projeto localmente, siga estes passos:

1. **Clone o Repositório**

   ```bash
   git clone
    ```

2. **Abra e Execute o Projeto**
- Abra o projeto na sua IDE preferida (recomendado: Spring Tool Suite ou IntelliJ IDEA).
- Execute o projeto como uma aplicação Spring Boot.

3. **Acessar o H2 Console**
- Com a aplicação em execução, abra o navegador e acesse `http://localhost:8080/h2-console`.
- Conecte-se ao banco de dados usando as credenciais definidas no `application.properties`.

## Testando a API

Você pode testar a API usando ferramentas como Postman ou Insomnia seguindo estes endpoints:

- **GET `/produtos`**: Retorna uma lista de todos os produtos.
- **GET `/produtos/{id}`**: Retorna os detalhes de um produto específico.
- **POST `/produtos`**: Cria um novo produto (requer um corpo de requisição JSON).
- **PUT `/produtos/{id}`**: Atualiza um produto existente (requer um corpo de requisição JSON).
- **DELETE `/produtos/{id}`**: Exclui um produto.

## Contribuições

Contribuições são sempre bem-vindas! Para contribuir, por favor, crie um novo branch e submeta um pull request para revisão.

## Licença

Este projeto é licenciado sob a [Licença MIT](LICENSE). Veja o arquivo `LICENSE` para mais detalhes.

---

Desenvolvido por Fellipe Oliveira
