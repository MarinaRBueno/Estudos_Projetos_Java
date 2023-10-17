import java.util.Scanner;

public class DataInput {
    public static void main(String[] args) throws Exception {
        // Cria um objeto Scanner para ler a entrada do usuário a partir do console
        Scanner sc = new Scanner(System.in);

        // Solicita e lê o nome do usuário
        System.out.println("Nome:");
        String name = sc.nextLine();

        // Solicita e lê a idade do usuário
        System.out.println("Idade:");
        int age = sc.nextInt();

        // Limpa a nova linha pendente após a leitura da idade
        sc.nextLine();

        // Solicita e lê a altura do usuário
        System.out.println("Altura: ");
        double height = sc.nextDouble();

        // Solicita e lê o gênero do usuário
        System.out.println("Genêro:");
        char gender = sc.next().charAt(0);

        // Fecha o objeto Scanner após a leitura de todos os dados
        sc.close();

        // Imprime os dados inseridos pelo usuário
        System.out.println(" ");
        System.out.println("Dados Digitados");
        System.out.println("Nome: " + name); // Imprime o nome
        System.out.println("Idade: " + age); // Imprime a idade
        System.out.println("Genêro: " + gender); // Imprime o gênero
        System.out.println("Altura: " + String.format("%.2f", height)); // Imprime a altura com duas casas decimais
    }
}
