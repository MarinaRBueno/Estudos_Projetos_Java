package exams; // Pacote onde a classe está localizada

import java.time.LocalDate;

import javax.swing.JOptionPane; // Importa a classe JOptionPane para interações com o usuário

/**
 * Classe abstrata(Classe Pai) Exams que serve como base para os exames de saúde.
 */
public abstract class Exams {

    // Atributos (Caracteristicas)
    private String patientName;
    private String bloodType;
    private int birthYear;
    private int age;

    /**
     * Construtor padrão da classe Exams.
    */
    public Exams() {
        this.patientName = "";
        this.bloodType = "";
        this.birthYear = 0;
        this.age = 0;
    }

    // Getters e Setters
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Métodos da classe Pai

    public void registerExams() {
        /*
         * Algumas funcionalidades na classe pai, para evitar reptição de código nas filhas
         * Método que Resgitra o Nome, tipo Snguineo e Ano de Nascimento do paciente
         */
        boolean inputValid = false;
        while (!inputValid) {
            try {
                setPatientName(JOptionPane.showInputDialog("Nome do Paciente:"));
                setBloodType(JOptionPane.showInputDialog("Tipo Sanguíneo:"));
                setBirthYear(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do paciente:")));
                inputValid = true; // Saia do loop se a entrada for válida
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um ano de nascimento válido.");
            }
        }
    }
    
     // Método abstrato para ser implementado nas classes filhas
    public abstract String sortResults();

    // Método que retorna uma string concatenando os dados do paciente, evitando repetição de código nas filhas
    public String showResults(){

        return "Nome do paciente: " + getPatientName() + System.lineSeparator() +
        "Tipo Sanguineo: " + getBloodType() + System.lineSeparator() +
        "Ano Nascimento: " + getBirthYear() + System.lineSeparator();
    } 

    // Método que retorna o ano atual
    public int currentDate(){
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        return currentYear;
    }

    // Método que calcula a idade baseado no ano
    public int calculateAge(){
        age = currentDate() - getBirthYear();
        return age;
    }
}
