# FurniFlow

## Descrição
Este é um projeto em Java desenvolvido com Maven para automatizar o processo de cotação em compras. O objetivo principal é facilitar e agilizar o processo de cotação, permitindo que usuários solicitem e comparem cotações de diferentes fornecedores de forma eficiente. Futuramente implemetaremos o front-end da aplicação.

## Tecnologias utilizadas
- Java
- Maven
- Spring
- Oracle Database
- Lombok

## Pré-requisitos
- Java 17 instalado
- Ter uma IDE instalada
- Maven instalado

## Como executar
- Clone este repositório do Github
- Coloque ele para executar na IDE

## Instruções
Por se tratar de uma aplicação demonstrativa muitas funcionalidades não estão funcionando corretamente, para que haja uma demonstração de uma possível requisição do cliente, ao rodar a classe Main() abrir no navegador "localhost:8081/product", isto retornará a lista de todos os produtos no banco de dados, após analisar os produtos disponíveis fazer as procuras passando seus requisitos através do endpoint "GET product/by-features", também é possivel fazer a pesquisa através de um único requisito (checar a documentação da API). Depois de analisar os produtos, escolher o ID do que mais se encaixa no que procura e então, passar a quantidade e enviar o pedido pelo endpoint "POST order", que irá salvar no banco de dados.

## Documentação da API
#### Server url
localhost:8081
#### Endpoints
##### 1. /product
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
- GET /product/by-features?name={name}&price={price}&quantity={quantity}

Descrição: Retorna uma lista de produtos  com o nome passado, preço e quantidade.
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

##### 2. /client
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
- POST /order?productId={productId}&quantity={quantity}

Descrição: Cria um novo pedido, através dos parâmetros passado na url, productId e quantity.
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

## Arquitetura da Solução
![Captura de Tela (174)](https://github.com/Leosagara/Challenge-Level-Group/assets/75694982/e50e0079-1404-442a-9a48-a4872bd01f64)

