# Assistente Virtual Universitário

Este projeto é um chatbot em Java para atendimento básico de alunos de uma universidade. O código em `src/App.java` simula um assistente virtual que conversa com o usuário via terminal, respondendo perguntas sobre:

- biblioteca
- secretaria
- matrícula
- financeiro
- carteirinha

O programa usa a classe `Scanner` para ler entradas do usuário e uma estrutura simples de controle de fluxo para identificar as mensagens e responder de acordo com o contexto.

## Sobre o código do `App.java`

A classe `App` contém o método `main`, que inicia a interação com o usuário. O fluxo principal é o seguinte:

- exibe uma mensagem de boas-vindas no console
- lê a mensagem digitada pelo usuário
- verifica palavras-chave como `biblioteca`, `matrícula`, `secretaria`, `boleto`, `oi`, `tchau`, entre outras
- responde com textos específicos para cada tema
- mantém um estado temporário para a biblioteca, permitindo que o usuário escolha entre horário ou localização

Esse tipo de estrutura é útil para criar chatbots simples em Java, especialmente para cenários de atendimento automatizado com regras fixas.

## Como executar

Pré-requisitos:

- Java JDK instalado
- terminal ou VS Code com suporte Java

Na raiz do projeto, execute os comandos:

```bash
javac src/App.java
java -cp src App
```

Se estiver usando o VS Code, também é possível executar a classe `App` diretamente pelo botão de execução da IDE.

## Exemplo de uso

```text
=========================================
     ASSISTENTE VIRTUAL UNIDERP
=========================================
Bot: Olá! Sou o assistente virtual da universidade.
Bot: Como posso ajudar você hoje?

Você: biblioteca
Bot: O que você deseja saber sobre a biblioteca?
     1 - Horário de funcionamento
     2 - Localização/Onde fica

Você: 1
Bot: A biblioteca funciona de segunda a sexta, das 07h às 22h.
```

Essa é uma versão simples, com propósito de realizar uma atividade para a disciplina de Chatbot no 8º semestre do curso de Bacharelado em Ciência da Computação (Uniderp).
