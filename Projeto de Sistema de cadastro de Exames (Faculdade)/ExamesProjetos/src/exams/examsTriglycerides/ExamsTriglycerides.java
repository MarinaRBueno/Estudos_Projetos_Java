package exams.examsTriglycerides; // Pacote onde a classe está localizada

import javax.swing.JOptionPane; // Importa a classe JOptionPane para interações com o usuário

import exams.Exams; // Importa a classe pai Exams para herdar funcionalidades

public class ExamsTriglycerides extends Exams{
    // Classe Filha Exame de Triglicerídeos 

    // Atributo que armazena quantidade de Triglicerídeos
    private int amountTriglycerides;

    // Getters e Setters
    public int getAmountTriglycerides() {
        return amountTriglycerides;
    }

    public void setAmountTriglycerides(int amountTriglycerides) {
        this.amountTriglycerides = amountTriglycerides;
    }

    // Construtor da classe Filha
    public ExamsTriglycerides(){
        super(); // Chama o construtor da classe pai
    }

    @Override
    public void registerExams() {
        // Método que cadastra os dados do paciente
        super.registerExams(); // Chama o método da classe pai para registrar informações básicas do paciente
        try {
            /* Solicita a quantidade de triglicerídeos ao usuário
            *Faz a conversão para um numero inteiro e armazena no atributo
            */ 
            this.amountTriglycerides = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Triglicerídeos: "));
        } catch (NumberFormatException e) {
            // Exibe uma mensagem de erro se a conversão falhar, pedindo ao usuário que insira um número válido
            JOptionPane.showMessageDialog(null, "Por favor, insira um valor válido para Triglicerídeos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }


    @Override
    public String sortResults() {
        // Método que classifica o resultado
        int age = calculateAge();
        if (age <= 9 && amountTriglycerides < 75) {
            return "Resultado: Bom";
        } else if (age > 9 && age <= 19 && amountTriglycerides < 90) {
            return "Resultado: Bom";
        } else if (amountTriglycerides < 150) {
            return "Resultado: Bom";
        } else {
            return "Resultado: Ruim";
        }
    }

    @Override
    public String showResults() {
        // Método que mostra os dados do paciente + classificação do resultado
        String showResults = super.showResults(); // Obtém informações básicas do paciente da classe pai
        String showAge = "Idade: " + super.calculateAge() + " anos\n"; // Mostra idade do paciente 
        String showTriglycerides= sortResults(); // Obtém a classificação dos resultados de Triglicerídes
        String showFullMessage = showResults + showAge + showTriglycerides;
        // Concatena uma String que exibe o resultado + informações

        JOptionPane.showMessageDialog(null, showFullMessage, "Resultado Triglicerídeos", JOptionPane.INFORMATION_MESSAGE);
        // Exibe a mensagem em uma caixa de diálogo

        return showFullMessage;  // Retorna a mensagem formatada
    }
    
}
