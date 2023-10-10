# Exemplo de Conexão Simples com Banco de Dados em Java

Este é um exemplo simples de como criar uma conexão com um banco de dados MySQL em um aplicativo Java usando JDBC.

## Pré-requisitos

Antes de usar este código de exemplo, certifique-se de ter o seguinte configurado em seu ambiente:

- Java Development Kit (JDK)
- MySQL Server
- MySQL Connector/J (Driver JDBC para MySQL)
- Utilizei o VS Code mas pode ser reproduzido em outras IDE's, como por exemplo NetBeans

## Configuração

1. Abra o arquivo `conexao/ConnectionBD.java` e defina as informações de configuração do seu banco de dados, como URL, nome de usuário e senha.

```java
private static final String URL = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
private static final String USER = "seu_usuario";
private static final String PASSWORD = "sua_senha";
```

Certifique-se de que o MySQL Connector/J esteja incluído no seu projeto.

## Uso

Você pode usar o exemplo de conexão em seu projeto Java da seguinte maneira:

```java
import DAO.UserDAO;
import entity.User;

public class App {
    public static void main(String[] args) {
        User user = new User();
        user.setUserName("Seu UserName");
        user.setUserLogin("Seu UserLogin");
        user.setUserPassword("Seu UserPassword");
        user.setUserEmail("Seu UserEmail");

        UserDAO userDAO = new UserDAO();
        userDAO.registerUser(user);
    }
}
```

Certifique-se de ajustar os valores de `setUserName`, `setUserLogin`, `setUserPassword` e `setUserEmail` de acordo com os dados do seu usuário.

## Contribuição

Contribuições são bem-vindas! Se você quiser melhorar este exemplo ou adicionar recursos adicionais, fique à vontade para enviar um pull request.
