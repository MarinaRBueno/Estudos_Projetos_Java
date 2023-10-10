package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.ConnectionBD; // Importa a classe de conexão com o banco de dados
import entity.User; // Importa a classe User que representa uma entidade de usuário

public class UserDAO {
    
    public void registerUser(User user) {

        // Define a instrução SQL para inserir um usuário no banco de dados
        String sql = "INSERT INTO USUARIO (NOME, LOGIN, SENHA, EMAIL) VALUES (?, ?, ?, ?)";

        PreparedStatement ps = null; // Declara uma variável para a PreparedStatement

        try {
            // Obtém uma conexão com o banco de dados através da classe ConnectionBD
            ps = ConnectionBD.getConexao().prepareStatement(sql);
            
            // Define os parâmetros da consulta SQL com os valores do objeto User fornecido
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getUserLogin());
            ps.setString(3, user.getUserPassword());
            ps.setString(4, user.getUserEmail());

            // Executa a consulta SQL para inserir o usuário no banco de dados
            ps.execute();

            // Fecha a PreparedStatement para liberar recursos
            ps.close();

        } catch (SQLException e) {
            // Em caso de exceção durante a execução da consulta SQL, imprime o erro
            e.printStackTrace();
        }
    }
}
