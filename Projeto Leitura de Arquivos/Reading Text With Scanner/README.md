# ReadTxt Java com Scanner e File

Exemplo simples de um programa Java que lê o conteúdo de um arquivo de texto e imprime suas linhas no console. O código utiliza a classe `Scanner` para realizar a leitura do arquivo. Irei evoluindo para leitura de arquivo CSV e Json.

## Detalhes do Código

O programa começa por criar um objeto File que representa o caminho do arquivo de texto que desejamos ler.

Em seguida, um objeto Scanner é inicializado, utilizando o objeto File como fonte de entrada. Isso permite que o programa leia o conteúdo do arquivo.

Um loop while é usado para iterar sobre as linhas do arquivo. O método hasNextLine() é usado para verificar se há mais linhas a serem lidas, e nextLine() é usado para ler e imprimir cada linha.

Se ocorrer algum erro durante a leitura do arquivo, uma mensagem de erro será exibida no console.

O programa se encarrega de fechar o objeto Scanner no bloco finally para garantir que os recursos sejam liberados adequadamente, mesmo em caso de exceção.

Lembre-se de substituir C://CaminhoDoArquivo pelo caminho real do arquivo que você deseja ler no seu sistema.

Este é apenas um exemplo simples de leitura de arquivos em Java, e pode ser estendido e modificado para atender a necessidades mais específicas.

### Conteúdo do Arquivo Frase.txt

´´
As grandes ideias surgem da observação dos pequenos detalhes.

Augusto Cury
´´