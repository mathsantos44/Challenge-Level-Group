# FurniFlow

## Descrição
Este é um projeto em Java com Maven desenvolvido para abordar o problema que as empresas tem com o processo de cotação de compras. O objetivo principal é criar um sistemas para automatizar este processo assim facilitar e agilizar o procedimento, permitindo que usuários solicitem e comparem cotações de diferentes fornecedores de forma eficiente. 

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
#### Server URL
- localhost:8081/

| Endpoint                                 | Método | Descrição                                                              | Parâmetros        | Resposta de Sucesso (Código HTTP) | Resposta de Falha (Código HTTP) |
|------------------------------------------|--------|------------------------------------------------------------------------|-------------------|-----------------------------------|----------------------------------|
| /client                                  | GET    | Retorna uma lista de todos os clientes cadastrados.                    | Nenhum            | Retorna uma lista de clientes (200) | Retorna um erro se não houver clientes cadastrados (404) |
| /client/{id}                             | GET    | Retorna os detalhes de um cliente específico com base no ID fornecido. | ID do cliente (PathVariable) | Retorna os detalhes do cliente correspondente ao ID (200) | Retorna um erro se o cliente não for encontrado (404) |
| /client                                  | POST   | Cria um novo cliente com base nos dados fornecidos.                   | Objeto JSON contendo os dados do cliente | Retorna os detalhes do cliente recém-criado (200) | Retorna um erro se os dados do cliente forem inválidos (400) |
| /client/{id}                             | PUT    | Atualiza os dados de um cliente existente com base no ID fornecido.   | ID do cliente (PathVariable), Objeto JSON contendo os novos dados do cliente | Retorna os detalhes do cliente atualizado (200) | Retorna um erro se o cliente não for encontrado (404) |
| /client/{id}                             | DELETE | Exclui um cliente existente com base no ID fornecido.                  | ID do cliente (PathVariable) | Retorna uma resposta vazia indicando sucesso na exclusão (204) | Retorna um erro se o cliente não for encontrado (404) |
| /order                                   | GET    | Retorna uma lista de todos os pedidos cadastrados.                    | Nenhum            | Retorna uma lista de pedidos (200) | Retorna um erro se não houver pedidos cadastrados (404) |
| /order/{id}                              | GET    | Retorna os detalhes de um pedido específico com base no ID fornecido. | ID do pedido (PathVariable) | Retorna os detalhes do pedido correspondente ao ID (200) | Retorna um erro se o pedido não for encontrado (404) |
| /order/{id}                              | PUT    | Atualiza os dados de um pedido existente com base no ID fornecido.    | ID do pedido (PathVariable), Objeto JSON contendo os novos dados do pedido | Retorna os detalhes do pedido atualizado (200) | Retorna um erro se o pedido não for encontrado (404) |
| /order/{id}                              | DELETE | Exclui um pedido existente com base no ID fornecido.                   | ID do pedido (PathVariable) | Retorna uma resposta vazia indicando sucesso na exclusão (204) | Retorna um erro se o pedido não for encontrado (404) |
| /order                                   | POST   | Cria um novo pedido com base no produto e na quantidade fornecidos.   | ID do produto (RequestParam), Quantidade do produto (RequestParam) | Retorna os detalhes do pedido recém-criado (200) | Retorna um erro se os dados do pedido forem inválidos (400) |
| /product                                 | GET    | Retorna uma lista de todos os produtos cadastrados.                    | Nenhum            | Retorna uma lista de produtos (200) | Retorna um erro se não houver produtos cadastrados (404) |
| /product/{id}                            | GET    | Retorna os detalhes de um produto específico com base no ID fornecido. | ID do produto (PathVariable) | Retorna os detalhes do produto correspondente ao ID (200) | Retorna um erro se o produto não for encontrado (404) |
| /product/by-price                        | GET    | Retorna uma lista de produtos com base no preço e no nome fornecidos.   | Preço do produto (RequestParam), Nome do produto (RequestParam) | Retorna uma lista de produtos filtrados (200) | Retorna um erro se não houver produtos correspondentes (404) |
| /product/by-name                         | GET    | Retorna uma lista de produtos com base no nome fornecido.               | Nome do produto (RequestParam) | Retorna uma lista de produtos filtrados (200) | Retorna um erro se não houver produtos correspondentes (404) |
| /product/by-features                     | GET    | Retorna uma lista de produtos com base no nome, preço máximo e quantidade fornecidos. | Nome do produto (RequestParam), Preço máximo do produto (RequestParam), Quantidade do produto (RequestParam) | Retorna uma lista de produtos filtrados (200) | Retorna um erro se não houver produtos correspondentes (404) |
| /product                                 | POST   | Cria um novo produto com base nos dados fornecidos.                   | Objeto JSON contendo os dados do produto | Retorna os detalhes do produto recém-criado (200) | Retorna um erro se os dados do produto forem inválidos (400) |
| /product/{id}                            | PUT    | Atualiza os dados de um produto existente com base no ID fornecido.   | ID do produto (PathVariable), Objeto JSON contendo os novos dados do produto | Retorna os detalhes do produto atualizado (200) | Retorna um erro se o produto não for encontrado (404) |
| /product/{id}                            | DELETE | Exclui um produto existente com base no ID fornecido.                  | ID do produto (PathVariable) | Retorna uma resposta vazia indicando sucesso na exclusão (204) | Retorna um erro se o produto não for encontrado (404) |
| /supplier                                | GET    | Retorna uma lista de todos os fornecedores cadastrados.                 | Nenhum            | Retorna uma lista de fornecedores (200) | Retorna um erro se não houver fornecedores cadastrados (404) |
| /supplier/{id}                           | GET    | Retorna os detalhes de um fornecedor específico com base no ID fornecido. | ID do fornecedor (PathVariable) | Retorna os detalhes do fornecedor correspondente ao ID (200) | Retorna um erro se o fornecedor não for encontrado (404) |
| /supplier                                | POST   | Cria um novo fornecedor com base nos dados fornecidos.                 | Objeto JSON contendo os dados do fornecedor | Retorna os detalhes do fornecedor recém-criado (200) | Retorna um erro se os dados do fornecedor forem inválidos (400) |
| /supplier/{id}                           | PUT    | Atualiza os dados de um fornecedor existente com base no ID fornecido. | ID do fornecedor (PathVariable), Objeto JSON contendo os novos dados do fornecedor | Retorna os detalhes do fornecedor atualizado (200) | Retorna um erro se o fornecedor não for encontrado (404) |
| /supplier/{id}                           | DELETE | Exclui um fornecedor existente com base no ID fornecido.                | ID do fornecedor (PathVariable) | Retorna uma resposta vazia indicando sucesso na exclusão (204) | Retorna um erro se o fornecedor não for encontrado (404) |

