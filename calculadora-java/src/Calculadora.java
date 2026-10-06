import java.util.Scanner;

public class CalculadoraJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ope2 = 0;
        int ope1 = 0;
        double num1 = 0;
        double num2 = 0;

        while (true) {
            System.out.print("Deseja fazer operações que necessitam de 1 ou 2 números? ");
            int nume = Integer.parseInt(sc.nextLine());

            if (nume != 1 && nume != 2) {
                System.out.println("ERROR, nao temos operações que necessitam de mais números. ");
                continue;
            }

            if (nume == 2) {
                while (true) {
                    System.out.println("(1) Adição + (2) Subtração + (3) Multiplicação + (4) Divisão + (5) Potenciação");
                    System.out.print("Qual operação deseja fazer? ");
                    ope2 = Integer.parseInt(sc.nextLine());

                    if (ope2 != 1 && ope2 != 2 && ope2 != 3 && ope2 != 4 && ope2 != 5) {
                        System.out.println("ERROR, nao existe está operação.");
                        continue;
                    }

                    System.out.print("Qual será o primeiro número: ");
                    num1 = Double.parseDouble(sc.nextLine());

                    System.out.print("Qual será o segundo número: ");
                    num2 = Double.parseDouble(sc.nextLine());

                    double resultado = Math.pow(num1, num2);

                    if (ope2 == 1) {
                        System.out.printf("O resultado é: %.2f\n", (num1 + num2));
                    } else if (ope2 == 2) {
                        System.out.printf("O resultado é: %.2f\n", (num1 - num2));
                    } else if (ope2 == 3) {
                        System.out.printf("O resultado é: %.2f\n", (num1 * num2));
                    } else if (ope2 == 4) {
                        if (num2 == 0) {
                            System.out.println("ERROR, 0 é um número invalído.");
                            continue;
                        } else {
                            System.out.printf("O resultado é: %.2f\n", (num1 / num2));
                        }
                    } else if (ope2 == 5) {
                        if (Double.isInfinite(resultado)) {
                            System.out.println("ERROR, O valor é muito grande.");
                            continue;
                        } else {
                            System.out.printf("O resultado é: %.2f\n", resultado);
                        }
                    }
                    break;
                }

            } else if (nume == 1) {
                while (true) {
                    System.out.println("(6) Raiz quadrada ");
                    System.out.print("Qual operação deseja fazer? ");
                    ope1 = Integer.parseInt(sc.nextLine());

                    if (ope1 != 6) {
                        System.out.println("ERROR, nao existe está operação.");
                        continue;
                    }

                    System.out.print("Qual será o número: ");
                    num1 = Double.parseDouble(sc.nextLine());

                    if (num1 < 0) {
                        System.out.println("ERROR, não é possível calcular a raiz de um número negativo.");
                        continue;
                    }

                    double resultadoQ = Math.sqrt(num1);

                    if (ope1 == 6) {
                        System.out.printf("O resultado é: %.2f\n", resultadoQ);
                    }

                    break;
                }
            }

            System.out.print("Deseja fazer outro calculo? (S/N) ");
            char resposta = sc.nextLine().charAt(0);

            if (resposta == 'N' || resposta == 'n') {
                System.out.println("Desligando calculadora...");
                break;
            }
        }

        sc.close();
    }
}
