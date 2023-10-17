import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadTxt {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = null;
        File file = new File("CaminhoDoArquivo//Reading Text With Scanner//Frase.txt");
        // Objeto file com o caminho do arquivo .txt
        try {

            sc = new Scanner(file);
            // Instância um  novo objeto do tipo scanner passando como parametro um obj file
            while (sc.hasNextLine()) {
                // Metódo hasNextLine verifica se há uma próximalinha disponível em um objeto Scanner
                System.out.println(sc.nextLine());
                // Imprime no terminal linha após linha
            }
            
        } catch (IOException e) {
           System.out.println("Error: " + e.getMessage());
           // Se houver algum erro, exibe a mensagem de erro + o tipo do erro
        }
        finally{
            if (sc != null) {
                // Se o objeto for diferente de nulo, então o scanner é fechado
                sc.close();
            }
        }
    }
}
