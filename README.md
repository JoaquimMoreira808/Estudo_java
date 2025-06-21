# Java CRUD Console – Projeto de Estudo

Este repositório contém um projeto simples em Java focado em operações CRUD no console, utilizando Java puro, sem bibliotecas externas.

---

## Descrição

- Criação e manipulação da classe `Produto` com atributos básicos.
- Implementação de um sistema CRUD (Criar, Ler, Atualizar, Deletar) via menu interativo no console.
- Manipulação manual da entrada de dados via `System.in`, sem uso de `Scanner`.
- Tratamento básico de exceções de entrada/saída.

---

## Estrutura

- `Produto.java` – Modelo de dados para produtos.
- `ConsoleHelper.java` – Funções estáticas para leitura de dados no console.
- `Main.java` – Classe principal com o menu e lógica de controle.

---

## Como executar

```bash
javac Produto.java ConsoleHelper.java Main.java
java Main
