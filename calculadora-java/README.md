🧮 Calculadora em Java
Aplicação de calculadora em consola desenvolvida em Java, capaz de realizar operações matemáticas básicas e avançadas com suporte a tratamento de erros.

🚀 Funcionalidades
A aplicação permite ao utilizador escolher entre operações que necessitam de 1 ou 2 números:

🔹 Operações com 2 Números:
Adição (+)

Subtração (-)

Multiplicação (*)

Divisão (/) — com validação para evitar divisão por zero

Potenciação (^) — com tratamento para limites de valor

🔹 Operações com 1 Número:
Raiz Quadrada (√) — com validação para números negativos

🛡️ Validações e Tratamento de Erros
Divisão por zero: Impede a execução e avisa o utilizador.

Raiz de número negativo: Bloqueia cálculos inválidos no conjunto dos números reais.

Entrada inválida: Repete o menu caso uma opção inexistente seja selecionada.

Repetição em loop: Permite realizar múltiplos cálculos consecutivos até que o utilizador decida encerrar.

🛠️ Tecnologias Utilizadas
Linguagem: Java

Entrada de Dados: java.util.Scanner

Operações Matemáticas: java.lang.Math (Math.pow, Math.sqrt)

💻 Como Executar o Projeto
Certifique-se de que tem o JDK instalado no seu computador.

Clone o repositório ou transfira o ficheiro Calculadora.java.

Abra o terminal na pasta onde o ficheiro está guardado.

Compile o ficheiro:
javac Calculadora.java

Execute a aplicação:
java Calculadora
