  # **Conversor de Moedas Java**

  Este programa Java foi desenvolvido para permitir que os usuários convertam valores entre diferentes moedas, utilizando a API ExchangeRate-API para obter taxas de câmbio em tempo real. O programa é capaz de proporcionar uma experiência intuitiva e eficiente na conversão de moedas, além de garantir a precisão das taxas de câmbio utilizadas.

- ## **Funcionalidade:** 
  O programa inicia solicitando ao usuário a inserção de um valor monetário e a especificação das moedas de origem e de destino para a conversão desejada. Utilizando a API ExchangeRate-API, o programa obtém as taxas de câmbio mais recentes e realiza a conversão do valor informado. Após a conversão, o resultado é salvo em um arquivo no formato JSON para registro e futuras consultas. 

- ## **Recursos Utilizados:** 
  A comunicação com a API ExchangeRate-API é realizada utilizando a classe `HttpClient`, responsável por enviar a requisição HTTP e receber a resposta da API. A manipulação e o processamento da resposta JSON obtida da API são efetuados pela biblioteca `Gson`, que facilita a conversão entre objetos Java e sua representação em JSON.

- ## **Como Usar:** 
  Para utilizar o programa, o usuário deve executá-lo e, em seguida, o programa apresenta um menu onde o usuário pode selecionar a conversão de moeda desejada. Após a seleção, o usuário deve fornecer os valores requisitados, incluindo o valor monetário a ser convertido e as moedas de origem e destino. O programa, então, processa a conversão e apresenta o resultado ao usuário.

Este programa foi projetado para ser uma ferramenta útil e prática para aqueles que necessitam realizar conversões de moeda de forma rápida e precisa, assegurando que as taxas de câmbio utilizadas sejam sempre atualizadas e confiáveis.

---

**OBJETIVO:** Desenvolver um Conversor de Moedas que ofereça interação textual (via console) com os usuários, proporcionando no mínimo 6 opções distintas de conversões de moedas em um menu. A taxa de conversão não será estática, mas sim dinamicamente obtida por meio de uma API, garantindo dados precisos e em tempo real para uma experiência mais atualizada e eficaz.
Os passos para completar este desafio serão detalhados a seguir e estarão disponíveis na seção adjacente:

- Configuração do Ambiente Java;
- Criação do Projeto;
- Consumo da API;
- Análise da Resposta JSON;
- Filtro de Moedas;
- Exibição de Resultados aos Usuários;

---

  ## Exemplo de uso:

    Selecione uma das seguintes moedas a ser convertida:
    1 - UYU  Uruguayan Peso Uruguay
    2 - ARS  Argentine Peso Argentina
    3 - MXN  Mexican Peso Mexico
    4 - EUR  Euro European Union
    5 - BOB  Bolivian Boliviano Bolivia
    6 - COP  Colombian Peso Colombia
    7 - VES  Venezuelan Bolívar Soberano	Venezuela
    8 - CLP  Chilean Peso Chile
    9 - CAD  Canadian Dollar	Canada
    10 - USD  United States Dollar United States
    11 - PEN  Peruvian Sol Peru
    12 - BRL  Brazilian Real Brazil
    
    12
   
    Moeda a ser convertida selecionada: BRL
    Agora selecione uma das moedas para a conversão
    1 - UYU  Uruguayan Peso Uruguay
    2 - ARS  Argentine Peso Argentina
    3 - MXN  Mexican Peso Mexico
    4 - EUR  Euro European Union
    5 - BOB  Bolivian Boliviano Bolivia
    6 - COP  Colombian Peso Colombia
    7 - VES  Venezuelan Bolívar Soberano	Venezuela
    8 - CLP  Chilean Peso Chile
    9 - CAD  Canadian Dollar	Canada
    10 - USD  United States Dollar United States
    11 - PEN  Peruvian Sol Peru

    X - BRL  Brazilian Real Brazil ( Já selecionado )
    
    4
    
    Digite o valor para a conversão
    
    20.50
    
    O valor de 20.5BRL convertidos para EUR é:
    3.5403499999999997

![Badge-Conversor](https://github.com/Luiza-Carolino/CoversorMoedas/assets/110407326/1cfda03f-48f4-4a1e-a0c6-e7a7a8f0984a)
