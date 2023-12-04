# NOME DA APLICAÇÃO
indefinido
# INTEGRANTES
- Ayslan Garcia – responsável pela implementação de API’s e auxílio na parte de projetos.
- Leonardo Sagara – responsável pelo desenvolvimento back-end e auxílio na parte de projetos.
- Matheus Oliveira – responsável pela integração Cloud do sistema, desenvolvimento da lógica de machine learning e auxílio na parte de projetos.
- Paulo Maldonado – responsável pelo desenvolvimento da interface gráfica e auxílio na parte de projetos.
- Pedro Kokuba – responsável pela criação do banco de dados e sua lógica e auxílio na parte de projetos.

# Proposta tecnológica
## Problema a ser resolvido
Empresas frequentemente enfrentam desafios ao buscar produtos específicos de fornecedores externos. O processo tradicional de cotação é muitas vezes lento, ineficiente e suscetível a erros. A ineficiência do processo de cotação manual é uma das principais questões a serem abordadas. A pesquisa extensiva de fornecedores e a compilação manual de informações sobre produtos consomem tempo considerável, prejudicando a agilidade operacional das empresas. Além disso, a dificuldade em identificar fornecedores ideais é um desafio comum. A falta de uma abordagem sistemática para avaliar e comparar propostas muitas vezes resulta em escolhas que não atendem plenamente às necessidades específicas da empresa.
## Solução proposta
O projeto propõe o desenvolvimento de um software inovador para simplificar e automatizar o processo de cotação de produtos de empresas. Baseado em requisitos do usuário e integrando Machine Learning, a solução visa eliminar as dificuldades associadas a esse procedimento. Ao aprender continuamente com padrões e preferências, o software tem o objetivo de tornar as cotações uma experiência eficiente, proporcionando às empresas uma abordagem mais ágil e inteligente para suas necessidades de aquisição de produtos, buscando também padronizar os dados dos fornecedores.

## Público alvo
- Empresas de médio e grande porte;
- Setores de compras;
- Indústrias.

## Impacto financeiro
- Redução de Custos Operacionais;
- Eficiência na Tomada de Decisões;
- Padronização de Dados;
- Aumento da Produtividade.

## Requisitos
- Permitir ao usuário inserir as características do produto que ele deseja;
- Usar algoritmos de Machine Learning para melhorar as opções apresentadas na cotação;
- Gerar cotações especializadas de acordo com o perfil da empresa.

## Tecnologias utilizadas
- Linguagem de programção - Java 18;
- Frameworks - Springboot 3.1.5, Hibernate 3;
- Front-end - React 18;
- Banco de dados: Oracle database 19.0.0;
- Controle de Versão - Git;
- Serviços de Cloud - Docker 4.25.2.

## Entregáveis
- Protótipo funcional do software de automação de cotações;
- Documentação detalhada;
- Relatório de teste e validação.

# O que ficará fora do escopo do projeto
- Não será trabalhado no programa estrutura de produtos muito complexos que demandem requisitos difíceis de tratar no código.
- Por se tratar de um projeto demonstrativo, não será usado uma base de dados com informações de fornecedores reais, mas para que as funcionalidades sejam testadas, será criado um banco de dados artificial de fornecedores e produtos.

# INSTRUÇÕES
Por se tratar de uma aplicação demonstrativa muitos funcionalidades não estão funcionando ainda, para que haja uma demonstração de uma possivel requisição do cliente, ao rodar a classe Main() abrir no navegador localhost:8081/product, isto retornará a lista de todos os produtos no banco de dados, após analisar os produtos fazer as procuras usando os endpoints.

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

#### 4. /request
- GET /request

Descrição: Retorna uma lista de todas as solicitações.
Código de Status de Sucesso: 200 OK.
Código de Status de Erro: 404 Not Found.
- GET /request/{id}

Descrição: Retorna uma solicitação com o ID passado.
Código de Status de Sucesso: 200 OK.
Código de Status de Erro: 404 Not Found.
- POST /request

Descrição: Cria uma nova solicitação.
Código de Status de Sucesso: 201 Created.
Código de Status de Erro: 400 Bad Request.
- PUT /request/{id}

Descrição: Atualiza uma solicitação pelo ID.
Código de Status de Sucesso: 200 OK.
Código de Status de Erro: 400 Bad Request.
- DELETE /request/{id}

Descrição: Remove uma solicitação pelo ID.
Código de Status de Sucesso: 204 No Content.
Código de Status de Erro: 404 Not Found.


# DIAGRAMA ENTIDADE RELACIONAMENTO
![image](https://github.com/Leosagara/Challenge/assets/75694982/ecc5ee4e-fd0c-4625-812a-20a26def6624)
# DIAGRAMA DE CLASSES
![image](https://github.com/Leosagara/Challenge/assets/75694982/747b011b-5492-4bc9-ad57-ca95d0c76e55)

