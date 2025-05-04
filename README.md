Uma API RESTful para gerenciamento de investimentos financeiros, desenvolvida com Spring Boot e JPA/Hibernate. Permite cadastrar, consultar, atualizar e excluir investimentos, simulando uma carteira de ativos.
🛠️ Tecnologias

    Java 17

    Spring Boot 3 (Web, Data JPA)

    H2 Database (ou qualquer banco compatível com JPA)

    Jakarta Validation (para validação de dados)

    Maven (gerenciamento de dependências)

🔍 Funcionalidades

✔️ CRUD completo de investimentos:

    POST /investimentos → Cria um novo investimento.

    GET /investimentos → Lista todos os investimentos.

    PUT /investimentos/{id} → Atualiza um investimento por ID.

    DELETE /investimentos/{id} → Remove um investimento.

✔️ Modelo de dados com:

    Nome, período, rentabilidade e valor inicial.
