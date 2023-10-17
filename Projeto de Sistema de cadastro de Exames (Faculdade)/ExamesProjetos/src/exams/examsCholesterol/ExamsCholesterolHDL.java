package exams.examsCholesterol; // Pacote onde a classe está localizada

import javax.swing.JOptionPane; // Importa a classe JOptionPane para interações com o usuário

import exams.Exams; // Importa a classe pai Exams para herdar funcionalidades

public class ExamsCholesterolHDL extends Exams {
    private int amountCholesterolHDL; // Atributo para armazenar a quantidade de colesterol HDL

    // Método getter para obter a quantidade de colesterol HDL
    public int getAmountCholesterolHDL() {
        return amountCholesterolHDL;
    }

    // Método setter para definir a quantidade de colesterol HDL
    public void setAmountCholesterolHDL(int amountCholesterolHDL) {
        this.amountCholesterolHDL = amountCholesterolHDL;
    }

    // Construtor da classe Filha
    public ExamsCholesterolHDL(){
        super(); // Chama o construtor da classe pai, Exams
    }

    // Método de registro específico para colesterol HDL, sobrescreve o método da classe pai
    @Override
    public void registerExams() {
        super.registerExams(); // Chama o método da classe pai para registrar informações básicas do paciente

        // Tenta obter a quantidade de colesterol HDL do usuário
        try {
            this.amountCholesterolHDL = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de colesterol HDL:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um valor válido para colesterol HDL.");
        }
    }
    
    // Método para classificar os resultados do exame de colesterol HDL, sobrescreve o método da classe pai
    @Override
    public String sortResults() {
        String resultsHDL;
    
        // Verifica a idade do paciente e a quantidade de colesterol HDL para classificar o resultado
        if ((calculateAge() <= 19 && amountCholesterolHDL > 45) || (calculateAge() >= 20 && amountCholesterolHDL > 40)) {
            resultsHDL = "Quantidade de colesterol HDL: " + amountCholesterolHDL +
                    System.lineSeparator() + "Resultado: Bom";
        } else {
            resultsHDL = "Quantidade de colesterol HDL: " + amountCholesterolHDL +
                    System.lineSeparator() + "Resultado: Ruim";
        }
        return resultsHDL;
    }

    // Método para exibir os resultados do exame de colesterol HDL, sobrescreve o método da classe pai
    @Override
    public String showResults() {
        // Obtém informações básicas do paciente da classe pai
        String showResults = super.showResults();
        String showAge = "Idade: " + super.calculateAge() + " anos\n"; // Mostra idade do paciente
        String showLDL = sortResults(); // Obtém o resultado do exame de colesterol HDL
        String showFullMessage = showResults + showAge + showLDL;
        // Concatena uma String que exibe o resultado + informações

        // Exibe os resultados em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, showFullMessage, "Resultado Colesterol HDL", JOptionPane.INFORMATION_MESSAGE);

        return showFullMessage; // Retorna os resultados formatados
    }
}