
# 🦜 Parrot Refactoring Kata - Refatoração de Código

## 📄 Descrição do Projeto

Este projeto é baseado no **Parrot Refactoring Kata**, um exercício clássico de refatoração. O objetivo é melhorar um código legado que calcula a velocidade e o som de diferentes tipos de papagaios.

O código original apresentava problemas como:
- Uso excessivo de estruturas condicionais (`switch`).
- Acoplamento a uma enumeração (`ParrotTypeEnum`).
- Um construtor genérico que aceitava muitos parâmetros, mesmo quando irrelevantes para alguns tipos de papagaios.
- Baixa coesão e alta dependência entre comportamentos.

## 🎯 Objetivo da Refatoração

- Melhorar a legibilidade e manutenibilidade do código.
- Aplicar boas práticas de **Engenharia de Software**.
- Utilizar princípios de **Clean Code** e **SOLID**.
- Garantir que o comportamento do sistema fosse mantido, apoiado por testes automatizados.

## 🔧 Melhorias Realizadas

### ✅ **1. Criação de Testes Automatizados**
- Implementação da classe `ParrotTest` utilizando **JUnit 5**.
- Testes cobrindo os métodos `getSpeed()` e `getCry()` de todos os tipos de papagaios.

### ✅ **2. Extração de Métodos**
- Divisão do método `getSpeed()` em métodos menores e mais legíveis:
    - `getSpeedForEuropean()`
    - `getSpeedForAfrican()`
    - `getSpeedForNorwegianBlue()`

### ✅ **3. Melhoria da Expressividade**
- Remoção de valores mágicos, substituídos por constantes nomeadas:
    - `BASE_SPEED`
    - `LOAD_FACTOR`
    - `MAX_SPEED`

### ✅ **4. Aplicação de Encapsulamento**
- Transformação da classe `Parrot` em **classe abstrata**, definindo um contrato claro com os métodos:
    - `getSpeed()`
    - `getCry()`
- Criação de subclasses específicas:
    - `EuropeanParrot`
    - `AfricanParrot`
    - `NorwegianBlueParrot`
- Cada subclasse possui apenas os atributos e comportamentos que lhe dizem respeito.

### ✅ **5. Reorganização de Classes e Processos**
- Remoção da enumeração `ParrotTypeEnum`.
- Remoção do construtor genérico da classe `Parrot`.
- Toda criação de papagaios agora é feita diretamente pelas subclasses, eliminando o uso de condicionais no código.

## 🗂️ Estrutura Final dos Arquivos

```
src
├── main
│   └── java
│       └── parrot
│           ├── Parrot.java                  → Classe abstrata (contrato)
│           ├── EuropeanParrot.java          → Subclasse específica
│           ├── AfricanParrot.java           → Subclasse específica
│           └── NorwegianBlueParrot.java     → Subclasse específica
├── test
│   └── java
│       └── parrot
│           └── ParrotTest.java               → Testes atualizados
docs
├── README.md                                 → Documentação
└── TP2_RELATORIO.pdf                         → Relatório da atividade
```

## 🔥 Benefícios da Refatoração

- ✅ Código mais limpo, legível e fácil de entender.
- ✅ Redução drástica de acoplamento.
- ✅ Código extensível sem necessidade de modificar o que já existe (**OCP — Open-Closed Principle**).
- ✅ Testes automatizados garantem segurança nas alterações.
- ✅ Facilidade para manutenção e adição de novos tipos de papagaios no futuro.

## 🚀 Como Executar os Testes

### Pré-requisitos:
- **Java 17 ou superior**
- **Maven**

### Rodar testes:
```bash
mvn test
```

## 🏆 Tecnologias Utilizadas
- Java 17+
- Maven
- JUnit 5

## ✍️ Autor
- Wendel Marins
