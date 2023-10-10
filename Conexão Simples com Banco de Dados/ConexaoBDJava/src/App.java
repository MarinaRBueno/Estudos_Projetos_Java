import DAO.UserDAO; // Importa a classe UserDAO
import entity.User; // Importa a classe User

public class App {
    public static void main(String[] args) throws Exception {
        // Cria uma instância da classe User
        User user = new User();

        // Preenche os campos do objeto User com valores fictícios
        user.setUserName("Seu UserName para teste");
        user.setUserLogin("Seu UserLogin para teste");
        user.setUserPassword("Seu UserPassword para teste");
        user.setUserEmail("Seu UserEmnail para teste");

        // Cria uma instância da classe UserDAO
        UserDAO userDAO = new UserDAO();

        // Chama o método registerUser da classe UserDAO para registrar o usuário no banco de dados
        userDAO.registerUser(user);
    }
}
