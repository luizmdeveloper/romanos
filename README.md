# Converter algarismo romano em número decimal

Utilizado a class `NumeroRomanoConverter` para conversão de um algarismo romano em número decimal.

Utilizado um estrutra HasSet para armazenar a key o seu algarismo e no value o seu equivalente.

O método `existsAlgarithim(String caracter)` verifica se o algarismo passado existe.
O método `caracterToValue(String caracter)` converte a algarismo para o número equivalente.
O método `hasNext(int index, String number)` verifica se o número passado contém um próximo número
O método `toDecimal(String number)` realiza a conversão do algarismo romano para um valor decimal seguinte lógica:
- Faz uma interação em cada letra do número (passado por parâmetro). 
- Pega a posição atual converte para um número.
- Verifica se há uma próxima caracter e onverte para um número.
- Analisa se a próxima letra é maior que a posição atual caso verdadeira diminui a posição atual. Caso contrário soma a posição atual.


## Instalção e configuração do projeto 

- Versão do [java 12](https://www.oracle.com/br/java/technologies/javase/jdk12-archive-downloads.html)
- Baixar e realizar a [instalação](https://confluence.jetbrains.com/pages/viewpage.action?pageId=54920165) o [inteliji](https://www.jetbrains.com/pt-br/idea/download/) versão ultimate
- Para executar o projeto busque a class `Main` para executar a aplicação.
- Para executar os teste busque a class `NumeroRomanoConverterTest` para executar os testes.