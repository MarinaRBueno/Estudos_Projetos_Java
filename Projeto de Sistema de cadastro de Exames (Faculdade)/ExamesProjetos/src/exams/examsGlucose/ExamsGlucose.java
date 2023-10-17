package exams.examsGlucose; // Pacote onde a classe está localizada

import javax.swing.JOptionPane;  // Importa a classe JOptionPane para interações com o usuário

import exams.Exams; // Importa a classe pai Exams para herdar funcionalidades

public class ExamsGlucose extends Exams {
    // CLasse Filha Exame de Glicemia

    // Atributo
    private int amountGlucose;

    // Getters e Setters
    public int getAmountGlucose() {
        return amountGlucose;
    }


    public void setAmountGlucose(int amountGlucose) {
        this.amountGlucose = amountGlucose;
    }

    // Construtor da classe Filha
    public ExamsGlucose(){
        super(); // Chama o construtor da classe pai, Exams
    } 

    @Override
    public void registerExams() {
        // Método que cadastra os dados do paciente
        super.registerExams(); // Chama o método da classe pai para registrar informações básicas do paciente

        while (true) {
            try {
                 // Solicita ao usuário a quantidade de glicemia e armazena na variável 'input'
                String input = JOptionPane.showInputDialog("Quantidade de Glicemia:");
                // Tenta converter a entrada do usuário (que é uma string) em um número inteiro (amountGlucose)
                this.amountGlucose = Integer.parseInt(input);
                break; // Saia do loop se a conversão for bem-sucedida
            } catch (NumberFormatException e) {
                // Exibe uma mensagem de erro se a conversão falhar, pedindo ao usuário que insira um número válido
                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                // Tratamento de exceções com try e catch para garatir que o ano de nascimento seja numero inteiro
            }
        }
    }

    @Override
    public String sortResults() {
        // Método que classifica o resultado
        if (amountGlucose >= 126) {
            return "Classificação: Diabetes Estabelecido";
        } else if (amountGlucose >= 100) {
            return "Classificação: Pré-Diabetes";
        } else {
            return "Classificação: Normoglicemia";
        }
    }

    @Override
    public String showResults() {
        // Método que mostra os dados do paciente + classificação do resultado
        String showResultsGlucose = super.showResults(); // Obtém informações básicas do paciente da classe pai
        String showGlucose = "Quantidade de Glicemia: " + amountGlucose + " mg/dL\n"; // Mostra a idade do paciente
        String sortResultsGlucose = sortResults(); // Obtém a classificação dos resultados de Glicemia
        String showFullMessage = showResultsGlucose + showGlucose + sortResultsGlucose;
        // Concatena uma String que exibe o resultado + informações

        JOptionPane.showMessageDialog(null, showFullMessage, "Resultado Glicemia", JOptionPane.INFORMATION_MESSAGE);
        // Exibe a mensagem em uma caixa de diálogo

        return showFullMessage; // Retorna a mensagem formatada
    }
    

}
