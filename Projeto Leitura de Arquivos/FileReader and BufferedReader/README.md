# Leitura de Arquivo de Texto em Java

Este é um programa Java simples que lê e imprime o conteúdo de um arquivo de texto. Ele utiliza as classes `FileReader` e `BufferedReader` para realizar a leitura do arquivo.

## Detalhes do Código

- O programa começa por definir o caminho do arquivo a ser lido. Certifique-se de que o caminho seja válido e aponte para o arquivo "Frase.txt" que você deseja ler.

- Um objeto `FileReader` é inicializado para ler o arquivo no caminho especificado.

- Em seguida, um objeto `BufferedReader` é inicializado para ler as linhas do arquivo de forma eficiente.

- O código utiliza um loop `while` para ler cada linha do arquivo e imprimir no console.

- Caso ocorra uma exceção de E/S (entrada/saída) durante a leitura, o programa imprime uma mensagem de erro.

- O bloco `finally` garante que os recursos (BufferedReader e FileReader) sejam fechados corretamente, mesmo em caso de erro.

Lembre-se de ajustar o caminho do arquivo, substituindo `"CaminhoDoArquivo\\Frase.txt"` pelo caminho real do arquivo que deseja ler no seu sistema.

Este é apenas um exemplo simples de leitura de arquivo de texto em Java e pode ser estendido e modificado para atender a necessidades mais específicas.

### Conteúdo do Arquivo Frase.txt

´´
As grandes ideias surgem da observação dos pequenos detalhes.

Augusto Cury
´´