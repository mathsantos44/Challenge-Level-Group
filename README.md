# NOME DA APLICAÇÃO
FurniFlow
# INTEGRANTES
- Ayslan Garcia – responsável pela implementação de API’s e auxílio na parte de projetos.
- Leonardo Sagara – responsável pelo desenvolvimento back-end e auxílio na parte de projetos.
- Matheus Oliveira – responsável pela integração Cloud do sistema, desenvolvimento da lógica de machine learning e auxílio na parte de projetos.
- Paulo Maldonado – responsável pelo desenvolvimento da interface gráfica e auxílio na parte de projetos.
- Pedro Kokuba – responsável pela criação do banco de dados e sua lógica e auxílio na parte de projetos.

# Objetivo do Projeto
O projeto propõe o desenvolvimento de um software inovador para simplificar e automatizar o processo de cotação de produtos de empresas. Baseado em requisitos do usuário e lógica back-end, a solução visa eliminar as dificuldades associadas a esse procedimento. O software tem o objetivo de tornar as cotações uma experiência eficiente, proporcionando às empresas uma abordagem mais ágil e inteligente para suas necessidades de aquisição de produtos, buscando também padronizar os dados dos fornecedores.

# INSTRUÇÕES
Por se tratar de uma aplicação demonstrativa muitas funcionalidades não estão funcionando corretamente, para que haja uma demonstração de uma possível requisição do cliente, ao rodar a classe Main() abrir no navegador localhost:8081/product, isto retornará a lista de todos os produtos no banco de dados, após analisar os produtos disponíveis fazer as procuras usando os endpoints.

# Documentação da API
### Server url
localhost:8081
### Endpoints
#### 1. /product
- GET /product

Descrição: Retorna uma lista de todos os produtos.
Código de Status de Sucesso: 200 OK.
Código de Status de Erro: 404 Not Found.
- GET /product/{id}

Descrição: Retorna um produto com o ID passado.
Código de Status de Sucesso: 200 OK.
Código de Status de Erro: 404 Not Found.
- GET /product/by-name?name={name}

Descrição: Retorna uma lista de produtos com o nome passado.
Código de Status de Sucesso: 200 OK.
Código de Status de Erro: 404 Not Found.
- GET /product/by-price?price={price}&name={name}

Descrição: Retorna uma lista de produtos  com o nome passado e e preço dentro do intervalo sugerido.
Código de Status de Sucesso: 200 OK.
Código de Status de Erro: 404 Not Found.
- POST /product

Descrição: Cria um produto
Código de Status de Sucesso: 201 OK.
Código de Status de Erro: 400 Bad Request.
- PUT /product/{id}

Descrição: Atualiza um produto pelo ID.
Código de Status de Sucesso: 200 OK.
Código de Status de Erro: 400 Bad Request.
- DELETE /product/{id}

Descrição: Remove um produto pelo ID.
Código de Status de Sucesso: 204 No Content.
Código de Status de Erro: 404 Not Found.

#### 2. /client
- GET /client

Descrição: Retorna uma lista de todos os clientes.
Código de Status de Sucesso: 200 OK.
Código de Status de Erro: 404 Not Found.
- GET /client/{id}

Descrição: Retorna um cliente com o ID passado.
Código de Status de Sucesso: 200 OK.
Código de Status de Erro: 404 Not Found.
- POST /client

Descrição: Cria um cliente.
Código de Status de Sucesso: 201 Created.
Código de Status de Erro: 400 Bad Request.
- PUT /client/{id}

Descrição: Atualiza um cliente pelo ID.
Código de Status de Sucesso: 200 OK.
Código de Status de Erro: 400 Bad Request.
- DELETE /client/{id}

Descrição: Remove um cliente pelo ID.
Código de Status de Sucesso: 204 No Content.
Código de Status de Erro: 404 Not Found.

#### 3. /supplier
- GET /supplier

Descrição: Retorna uma lista de todos os fornecedores.
Código de Status de Sucesso: 200 OK.
Código de Status de Erro: 404 Not Found.
- GET /supplier/{id}

Descrição: Retorna um fornecedor com o ID passado.
Código de Status de Sucesso: 200 OK.
Código de Status de Erro: 404 Not Found.
- POST /supplier

Descrição: Cria um novo fornecedor.
Código de Status de Sucesso: 201 Created.
Código de Status de Erro: 400 Bad Request.
- PUT /supplier/{id}

Descrição: Atualiza um fornecedor pelo ID.
Código de Status de Sucesso: 200 OK.
Código de Status de Erro: 400 Bad Request.
- DELETE /supplier/{id}

Descrição: Remove um fornecedor pelo ID.
Código de Status de Sucesso: 204 No Content.
Código de Status de Erro: 404 Not Found.

#### 4. /order
- GET /order

Descrição: Retorna uma lista de todas os pedidos.
Código de Status de Sucesso: 200 OK.
Código de Status de Erro: 404 Not Found.
- GET /order/{id}

Descrição: Retorna um pedido com o ID passado.
Código de Status de Sucesso: 200 OK.
Código de Status de Erro: 404 Not Found.
- POST /order

Descrição: Cria um novo pedido.
Código de Status de Sucesso: 201 Created.
Código de Status de Erro: 400 Bad Request.
- PUT /order/{id}

Descrição: Atualiza um pedido pelo ID.
Código de Status de Sucesso: 200 OK.
Código de Status de Erro: 400 Bad Request.
- DELETE /order/{id}

Descrição: Remove um pedido pelo ID.
Código de Status de Sucesso: 204 No Content.
Código de Status de Erro: 404 Not Found.

# Arquitetura
![Captura de Tela (174)](https://github.com/Leosagara/Challenge-Level-Group/assets/75694982/e50e0079-1404-442a-9a48-a4872bd01f64)
# DIAGRAMA ENTIDADE RELACIONAMENTO
![image](https://github.com/Leosagara/Challenge/assets/75694982/ecc5ee4e-fd0c-4625-812a-20a26def6624)
# DIAGRAMA DE CLASSES
![image](https://github.com/Leosagara/Challenge/assets/75694982/747b011b-5492-4bc9-ad57-ca95d0c76e55)

