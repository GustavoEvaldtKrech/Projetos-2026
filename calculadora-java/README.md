# 🧮 Calculadora em Java

Aplicação de calculadora em console desenvolvida em Java, capaz de realizar operações matemáticas básicas e avançadas com suporte a tratamento de erros.

---

## 🚀 Funcionalidades

A aplicação permite ao usuário escolher entre operações que necessitam de 1 ou 2 números:

### 🔹 Operações com 2 Números:
1. **Adição** (`+`)
2. **Subtração** (`-`)
3. **Multiplicação** (`*`)
4. **Divisão** (`/`) — *com validação para evitar divisão por zero*
5. **Potenciação** (`^`) — *com tratamento para limites de valor*

### 🔹 Operações com 1 Número:
6. **Raiz Quadrada** (`√`) — *com validação para números negativos*

---

## 🛡️ Validações e Tratamento de Erros

- **Divisão por zero:** Impede a execução e avisa o usuário.
- **Raiz de número negativo:** Bloqueia cálculos inválidos no conjunto dos números reais.
- **Entrada inválida:** Repete o menu caso uma opção inexistente seja selecionada.
- **Repetição em loop:** Permite realizar múltiplos cálculos consecutivos até que o usuário decida encerrar.

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java
- **Entrada de Dados:** `java.util.Scanner`
- **Operações Matemáticas:** `java.lang.Math` (`Math.pow`, `Math.sqrt`)

---

## 💻 Como Executar o Projeto

1. Certifique-se de que tem o JDK instalado no seu computador.
2. Clone o repositório ou baixe o arquivo `Calculadora.java`.
3. Abra o terminal na pasta `src` onde o arquivo está salvo.
4. Compile e execute a aplicação:
   ```bash
   cd Projetos-2026/calculadora-java/src
   javac Calculadora.java
   java Calculadora
