package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.models.Produto;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        try {
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("oracle");
            EntityManager entityManager = entityManagerFactory.createEntityManager();
        } catch (Exception e) {
            throw e;
        }

        //Exemplo de requisição via Scanner, com dois parâmetros nome do produto e faixa de preço

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o produto que procura: ");
        String scanner_nome = scan.nextLine();
        System.out.print("Qual o valor máximo para o produto: ");
        Float scanner_preco = Float.parseFloat(scan.nextLine());

        //Conexão com o banco

        String jdbcUrl = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
        String usuario = "rm96934";
        String senha = "290499";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, usuario, senha)) {
            // Verificar se a coluna existe na tabela
                ResultSet resultSet = connection.getMetaData().getColumns(null, null, "PRODUTO", null);

            if (resultSet.next()) {
                List<Produto> lista_produtos = new ArrayList<>();
                String query = "SELECT * FROM PRODUTO WHERE produto_preco<? and produto_nome=?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setFloat(1,scanner_preco);
                preparedStatement.setString(2,scanner_nome);
                ResultSet result = preparedStatement.executeQuery();

                // Processar e imprimir os objetos
                while (result.next()) {
                    Produto produto = new Produto();
                    produto.setId(result.getLong("produto_id"));
                    produto.setProduto_nome(result.getString("produto_nome"));
                    produto.setProduto_preco(result.getFloat("produto_preco"));
                    produto.setProduto_tipo(result.getString("produto_tipo"));
                    produto.setProduto_quantidade(result.getInt("produto_quantidade"));

                    /*Nota-se que os prosutos gerados tem fornecedores e requisicoes nulas, porque deve ser passado objetos
                    dentro deles, mas como esta é apenas uma amostra optamos por deixar assim já que não afeta o desempenho do código no momento
                     */
                    System.out.println(produto);
                    System.out.println("Fornecedor: "+result.getInt("fornecedor_id"));
                }


            } else {
                System.out.println("ERRO");
            }

        } catch (Exception e) {
            e.printStackTrace();


        }
    }
}