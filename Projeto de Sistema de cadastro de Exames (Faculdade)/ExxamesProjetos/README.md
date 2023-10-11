# Laboratório de Monitoramento de Exames

Este é um projeto simples de laboratório que visa criar um dispositivo de monitoramento de três tipos de exames: glicemia, colesterol e triglicerídeos. Cada exame possui características em comum, como nome do paciente, tipo sanguíneo e ano de nascimento, além de características específicas. Esse foi um trabalho acadêmico da disciplina de Programação 1 (Análise e Desenvolvimento de Sistemas/UniCesumar), fiz algumas validações que eram necessárias e pretendo em breve aperfeiçoar esse código conforme avanço nos estudos.

## Características dos Exames

### Glicemia

- **Atributos Específicos**:
  - Quantidade de glicose por mg/l

- **Classificação de Resultado**:
  - Normoglicemia: Inferior a 100 mg/dL
  - Pré-diabetes: Superior ou igual a 100 mg/dL e inferior a 126 mg/dL
  - Diabetes estabelecido: Superior ou igual a 126 mg/dL

### Colesterol

- **Atributos Específicos**:
  - Quantidade de LDL e HDL por mg/l
  - Risco do paciente (B - baixo, M - médio, A - alto)

- **Classificação de Resultado**:
  - Colesterol HDL:
    - De 0 a 19 anos: superior a 45 mg/dL (HDL - BOM)
    - Acima de 20 anos: superior a 40 mg/dL (HDL - BOM)
  - Colesterol LDL:
    - Risco baixo: abaixo de 100 mg/dL
    - Risco médio: abaixo de 70 mg/dL
    - Risco alto: abaixo de 50 mg/dL

### Triglicerídeos

- **Atributos Específicos**:
  - Quantidade de triglicerídeos por mg/l

- **Classificação de Resultado**:
  - De 0 a 9 anos: Com jejum: inferior a 75 mg/dL
  - De 10 a 19 anos: Com jejum: inferior a 90 mg/dL
  - Acima de 20 anos: Com jejum: inferior a 150 mg/dL

## Pilares da Orientação a Objeto

Este projeto segue os princípios dos 4 pilares da orientação a objeto:

1. **Abstração**: Abstrai as características comuns e específicas dos exames em classes e métodos.

2. **Encapsulamento**: Encapsula os atributos e métodos, protegendo o acesso e garantindo que os dados sejam acessados apenas da maneira apropriada.

3. **Herança**: Utiliza herança para compartilhar características comuns entre os diferentes tipos de exames, economizando duplicação de código.

4. **Polimorfismo**: Implementa métodos comuns que podem ser usados de maneira polimórfica para classificar e mostrar resultados.

## Como Executar o Projeto

Para executar o projeto, você pode criar instâncias das classes de exames (Glicemia, Colesterol, Triglicerídeos) e chamar os métodos apropriados para cada tipo de exame. Os dados de teste podem ser fictícios.

```java
public class Main {
    public static void main(String[] args) {
        // Exemplo de uso do projeto
        Glicemia glicemia = new Glicemia();
        glicemia.registerExams(); // Registra os dados do paciente
        glicemia.showResults(); // Mostra o resultado na tela
    }
}
```

## Contribuições

Contribuições são bem-vindas! Se você deseja contribuir para este projeto, fique a vontade.

## Licença

Este projeto está licenciado sob a Licença MIT.

