package conexao;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBD {
    
    // Configuração da URL, nome de usuário e senha para o banco de dados MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/mapa";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // Variável estática para armazenar a conexão com o banco de dados
    private static java.sql.Connection conn;

    // Método para obter uma conexão com o banco de dados
    public static java.sql.Connection getConexao(){
        try {
            // Verifica se a conexão já foi estabelecida; se não, cria uma nova conexão
            if(conn == null){
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
                return conn;
            } else {
                return conn; // Retorna a conexão existente se já estiver aberta
            }
        } catch (SQLException e) {
            // Em caso de erro durante a obtenção da conexão, imprime o erro
            e.printStackTrace();
            return null; // Retorna null em caso de erro
        }
    }
}
