import java.util.Locale;

public class VariableAssignment {
    public static void main(String[] args) throws Exception {
        // Configura a localização para usar o formato de números dos EUA (ponto como separador decimal)
        Locale.setDefault(Locale.US);

        // Declaração e inicialização de variáveis
        int age = 26;
        String name = "Marina";
        double height = 1.69; // Usando a classe de wrapper Double para números de ponto flutuante
        char gender = 'F';

        // Impressão dos dados
        System.out.println("Dados");
        System.out.println("Nome: " + name); // Imprime o nome
        System.out.println("Idade: " + age); // Imprime a idade
        System.out.println("Genêro: " + gender); // Imprime o gênero
        System.out.println("Altura: " + String.format("%.2f", height)); // Imprime a altura com duas casas decimais
        System.out.println(""); // Imprime uma linha em branco para separar as seções

        // Impressão das informações formatadas
        System.out.println("Olá, meu nome é " + name + ", tenho " + age + " anos.");
        System.out.println("Sou do genêro " + gender + ", e minha altura é " + String.format("%.2f", height));
    }
}
