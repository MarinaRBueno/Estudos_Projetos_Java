// Importa as classes necessárias para realizar os exames de saúde
import exams.examsCholesterol.ExamsCholesterolHDL;
import exams.examsCholesterol.ExamsCholesterolLDL;
import exams.examsGlucose.ExamsGlucose;
import exams.examsTriglycerides.ExamsTriglycerides;

// Classe principal que contém o método main, que é o ponto de entrada do programa
public class Main {
    public static void main(String[] args) throws Exception {
        
        // Cria uma instância da classe de exame de glicose
        ExamsGlucose eg = new ExamsGlucose();
        
        // Realiza o registro dos exames de glicose
        eg.registerExams();
        
        // Exibe os resultados dos exames de glicose
        eg.showResults();

        // Cria uma instância da classe de exame de colesterol LDL
        ExamsCholesterolLDL ecLDL = new ExamsCholesterolLDL();
        
        // Realiza o registro dos exames de colesterol LDL
        ecLDL.registerExams();
        
        // Exibe os resultados dos exames de colesterol LDL
        ecLDL.showResults();

        // Cria uma instância da classe de exame de colesterol HDL
        ExamsCholesterolHDL ecHDL = new ExamsCholesterolHDL();
        
        // Realiza o registro dos exames de colesterol HDL
        ecHDL.registerExams();
        
        // Exibe os resultados dos exames de colesterol HDL
        ecHDL.showResults();

        // Cria uma instância da classe de exame de triglicerídeos
        ExamsTriglycerides et = new ExamsTriglycerides();
        
        // Realiza o registro dos exames de triglicerídeos
        et.registerExams();
        
        // Exibe os resultados dos exames de triglicerídeos
        et.showResults();
    }
}
