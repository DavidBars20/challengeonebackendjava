Challenge One Backend Java - Conversor de Moedas

Esse é um programa Conversor de Moedas desenvolvido em Java que faz a conversão entre algumas moedas definidas em uma lista e, utilizando uma API de taxas de câmbio, realiza a conversão de acordo com o valor do dia.
Funcionalidades

    Conversão de valores entre diferentes moedas, como USD, EUR, BRL, JPY, GBP, e CAD.
    As taxas de câmbio são obtidas em tempo real a partir de uma API, garantindo dados precisos e atualizados.
    Interação via console, com um menu intuitivo para seleção de moedas e entrada de valores.

Tecnologias Utilizadas

    Java: Linguagem principal do projeto.
    Gson 2.11: Biblioteca usada para manipular o JSON retornado pela API de câmbio.
    API de taxas de câmbio: Utilizada para buscar as taxas de conversão em tempo real (ex: ExchangeRate-API).
    HTTP Client: Utilizado para fazer requisições à API e obter os dados em JSON.

Pré-requisitos

Para rodar o projeto localmente, você precisará ter instalado:

    JDK 11 ou superior
    Gson 2.11 (pode ser adicionado como dependência via Maven ou manualmente)
    Chave de API de um serviço de taxas de câmbio (ex: ExchangeRate-API)

Como Executar o Projeto

    Clone o repositório para sua máquina local.
    Adicione a biblioteca Gson ao projeto (veja abaixo como instalar).
    Adicione a sua chave da API no arquivo do código, substituindo o valor de API_KEY.
    Compile o código e execute o programa.

Executando no Console

Após compilar o código, o programa exibirá um menu no console para que o usuário selecione as moedas de origem e destino, bem como o valor a ser convertido. O programa realizará a requisição à API para obter a taxa de câmbio do dia e calcular o valor convertido.
Exemplo de Uso

    Selecione a moeda base: USD
    Selecione a moeda de conversão: BRL
    Digite o valor a ser convertido: 100

O programa retornará o valor convertido com base na taxa atual de câmbio.
Como Adicionar o Gson
Se estiver usando Maven:

Adicione a seguinte dependência ao seu arquivo pom.xml:
------------------------------------------------------------------------------------------------
xml

<dependencies>
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.11</version>
    </dependency>
</dependencies>
------------------------------------------------------------------------------------------------
Se estiver usando manualmente:

    Baixe o arquivo gson-2.11.jar do site oficial do Gson.
    Adicione o .jar ao classpath do seu projeto.

Gerando um Executável

Se você quiser distribuir o programa como um executável .exe, pode seguir as etapas de criação de um arquivo .jar e utilizar uma ferramenta como o Launch4J para converter o arquivo .jar em um .exe.
Contribuições

Sinta-se à vontade para contribuir com melhorias para este projeto! Você pode abrir issues ou pull requests no repositório do GitHub.
