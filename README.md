# Exercícios de Generics e Streams em Java

Este repositório contém uma coleção de exercícios práticos utilizando **Generics** e **Streams** na linguagem **Java**. Os exemplos e desafios aqui propostos têm como objetivo reforçar o entendimento desses conceitos fundamentais da linguagem, com foco em boas práticas de programação orientada a objetos e programação funcional.

### 📚 Conteúdo

#### 🔸 Generics
- Implementação de classes genéricas
- Métodos genéricos
- Uso de limites com wildcards (`<? extends T>`, `<? super T>`)
- Exemplo de reuso de código com Generics

#### 🔸 Streams
- Filtragem e transformação de dados com `filter`, `map`, `flatMap`
- Operações de agregação: `reduce`, `sum`, `count`, `average`
- Ordenação e coleta de dados com `sorted`, `collect`, `Collectors.groupingBy`
- Uso de `Optional` e tratamento funcional de valores nulos

### 🧠 Objetivos

- Consolidar os conceitos de Generics para criar código reutilizável e seguro em tempo de compilação.
- Aplicar a API de Streams para processar coleções de forma funcional e eficiente.
- Estimular a leitura e escrita de código mais limpo, conciso e expressivo.

### 🚀 Requisitos

- Java 8 ou superior
- IDE de sua preferência (IntelliJ, Eclipse, VS Code, etc.)

### 📁 Estrutura do Projeto

src/
├── List/
│ ├── CarrinhoCompras/
│ │ ├── CarrinhoCompras.java
│ │ ├── Item.java
│ │ ├── Main.java
│ ├── OperacoesBasicas/
│ │ ├── ListaTarefas.java
│ │ ├── Tarefa.java
│ │ ├── Main.java
│ └── Search/
│ │ ├── Livros
│ │ │ ├── CatalogoLivros.java
│ │ │ ├── Livro.java
│ │ │ ├── Main.java
│ │ ├── SomaNumeros
│ │ │ ├── Main.java
│ │ │ ├── SomaNumeros.java

src/
├── List/
│ ├── CarrinhoCompras/
│ │ ├── CarrinhoCompras.java
│ │ ├── Item.java
│ │ └── Main.java
│ ├── OperacoesBasicas/
│ │ ├── ListaTarefas.java
│ │ ├── Tarefa.java
│ │ └── Main.java
│ └── Search/
│ │ ├── Livros/
│ │ │ ├── CatalogoLivros.java
│ │ │ ├── Livro.java
│ │ │ └── Main.java
│ │ └── SomaNumeros/
│ │ │ ├── SomaNumeros.java
│ │ │ └── Main.java


## ✅ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/RaulRenshaw/Collections_DIO.git
   
2. Importe o projeto em sua IDE ou compile via terminal:
   javac src/**/*.java
   java List.Search.SomaNumeros.Main

3. Explore os exercícios e modifique conforme desejar!

📌 Dicas
Tente resolver os exercícios antes de consultar a solução.

Use o debug da IDE para entender o fluxo dos métodos com Streams.

Experimente implementar suas próprias classes genéricas.

🧑‍💻 Autor
Desenvolvido por Raul Vitor de Brito Renshaw
[Linkedin]([URL](https://www.linkedin.com/in/raul-vitor-932422312/))
[GitHub]([URL](https://www.linkedin.com/in/raul-vitor-932422312/)](https://github.com/RaulRenshaw))
