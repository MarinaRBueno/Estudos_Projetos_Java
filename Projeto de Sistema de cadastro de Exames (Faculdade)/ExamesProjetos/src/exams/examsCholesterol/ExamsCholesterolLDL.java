package exams.examsCholesterol; // Pacote onde a classe está localizada

import javax.swing.JOptionPane; // Importa a classe JOptionPane para interações com o usuário

import exams.Exams; // Importa a classe pai Exams para herdar funcionalidades

public class ExamsCholesterolLDL extends Exams {

    // Atributos
    private int amountCholesterolLDL; // Atributo para armazenar a quantidade de colesterol LDL
    private String risk; // Atributo para armazenar o grau de risco (A-Alto, M-Médio, B-Baixo)
    
    // Getters e Setters
    public int getAmountCholesterolLDL() {
        return amountCholesterolLDL;
    }

    public void setAmountCholesterolLDL(int amountCholesterolLDL) {
        this.amountCholesterolLDL = amountCholesterolLDL;
    }

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }

    // Construtor da classe Filha
    public ExamsCholesterolLDL(){
        super(); // Chama o construtor da classe pai, Exams
    }

     // Método para registrar os exames de colesterol LDL, sobrescreve o método da classe pai
    @Override
    public void registerExams() {
        // Chama o método da classe pai para registrar informações básicas do paciente
        super.registerExams();

        try {
            // Tenta obter a quantidade de colesterol LDL do usuário
            this.amountCholesterolLDL = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de colesterol LDL:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um valor válido para colesterol LDL.");
            return; // Em caso de erro, exibe uma mensagem e retorna
        }

        while (true) {
            // Usa um loop para garantir que o grau de risco seja válido
            try {
                this.risk = JOptionPane.showInputDialog("Risco (A-Alto, M-Médio, B-Baixo)");
        
                // Chama o método normalizeRisk para garantir que o grau de risco seja padronizado
                this.risk = normalizeRisk(this.risk);
        
                // Valida se o grau de risco é uma das opções válidas
                if (isValidRisk(this.risk)) {
                    break; // Sai do loop se a entrada for válida
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, insira o risco corretamente (A, M ou B).");
                }
            } catch (Exception e) {
                // Exibe a mensagem caso tenha alguma exceção
                JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e.getMessage());
            }
        }
        
    }

    // Método para validar o grau de risco
    private boolean isValidRisk(String value) {
         // Verifica se o valor não é nulo e se é uma das representações válidas de risco.
        return value != null && (value.equalsIgnoreCase("A") || value.equalsIgnoreCase("M") || value.equalsIgnoreCase("B") || value.equalsIgnoreCase("Alto") || value.equalsIgnoreCase("Médio") || value.equalsIgnoreCase("Baixo"));
    }
    
    // Método para normalizar o grau de risco
    private String normalizeRisk(String value) {
        
        if (value == null) {
            return null;
        } // Verifica se o valor é nulo, se for ele retorna null e impede que o código quebre
    
        // Converte o valor para minúsculas e remove espaços em branco extras
        value = value.trim().toLowerCase();
    
        switch (value) {
            case "a":
            case "alto":
                return "A";
            case "b":
            case "baixo":
                return "B";
            case "m":
            case "medio":
                return "M";
            default:
                // Se não for uma das opções conhecidas, retorna o valor da primeira letra em maiúscula
                return value.substring(0, 1).toUpperCase() + value.substring(1);
        } // Retorna a representação padronizada do grau de risco
    }

    /**
     * Método que classifica o resultado dos exames de colesterol LDL.
     *
     * O método calcula o risco com base no valor do colesterol LDL e classifica como "Bom" ou "Ruim".
     * O resultado é uma string formatada que inclui a quantidade de colesterol LDL, o grau de risco
     * (A-Alto, M-Médio, B-Baixo) e o resultado final ("Bom" ou "Ruim").
     *
     * @return Uma string que representa o resultado da classificação do colesterol LDL.
     */
    @Override
    public String sortResults() {
        // String que irá armazenar as informações do resultado
        String resultsLDL = "Quantidade de colesterol LDL: " + amountCholesterolLDL +
                System.lineSeparator() + "Grau de Risco(A-Alto, M-Médio, B-Baixo): " + risk +
                System.lineSeparator() + "Resultado: ";

        risk = normalizeRisk(risk);

        // Utiliza um switch para classificar o resultado com base no grau de risco e no valor de colesterol LDL
        switch (risk) {
            case "A" -> resultsLDL += amountCholesterolLDL < 50 ? "Bom" : "Ruim";
            case "M" -> resultsLDL += amountCholesterolLDL < 70 ? "Bom" : "Ruim";
            case "B" -> resultsLDL += amountCholesterolLDL < 100 ? "Bom" : "Ruim";
            default -> resultsLDL += "Desconhecido (Risco não reconhecido)";
        }
        return resultsLDL;
    }

    @Override
    public String showResults(){
        // Método que mostra os dados do paciente + classificação do resultado
        String showResults = super.showResults(); // Obtém informações básicas do paciente da classe pai
        String showAge = "Idade: " + super.calculateAge() + " anos\n"; // Mostra idade do paciente 
        String showLDL= sortResults(); // Obtém a classificação dos resultados do colesterol LDL
        String showFullMessage = showResults + showAge + showLDL;
        // Concatena uma String que exibe o resultado + informações

        JOptionPane.showMessageDialog(null, showFullMessage, "Resultado Colesterol LDL", JOptionPane.INFORMATION_MESSAGE);
        // Exibe a mensagem em uma caixa de diálogo

        return showFullMessage; // Retorna a mensagem formatada
    }
    
}
