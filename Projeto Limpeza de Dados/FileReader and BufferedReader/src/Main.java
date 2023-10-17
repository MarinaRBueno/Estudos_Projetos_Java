import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        // Define o caminho do arquivo a ser lido.
        String path = "CaminhoDoArquivo\\Frase.txt";

        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Inicializa um objeto FileReader para ler o arquivo no caminho especificado.
            fr = new FileReader(path);

            // Inicializa um objeto BufferedReader para ler as linhas do arquivo de forma eficiente.
            br = new BufferedReader(fr);

            // Lê a primeira linha do arquivo.
            String line = br.readLine();

            // Enquanto houver linhas para ler (a linha não é nula), execute o loop.
            while (line != null) {
                // Imprime a linha no console.
                System.out.println(line);

                // Lê a próxima linha do arquivo.
                line = br.readLine();
            }
        } catch (IOException e) {
            // Se ocorrer uma exceção de E/S (IOException), imprime uma mensagem de erro.
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                // Fecha o BufferedReader e o FileReader para liberar recursos.
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                // Em caso de erro ao fechar os recursos, imprime a exceção.
                e.printStackTrace();
            }
        }
    }
}
