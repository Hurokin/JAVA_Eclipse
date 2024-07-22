package calculadora;

import java.util.Scanner;

public class CalculadoraAplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Científica");
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Operações disponíveis:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Exponenciação");
        System.out.println("6. Raiz quadrada");
        System.out.println("7. Seno");
        System.out.println("8. Cosseno");
        System.out.println("9. Tangente");
        System.out.println("10. Logaritmo natural");
        System.out.print("Escolha a opção (1-10): ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                double soma = num1 + num2;
                System.out.println("Resultado da soma: " + soma);
                break;
            case 2:
                double subtracao = num1 - num2;
                System.out.println("Resultado da subtração: " + subtracao);
                break;
            case 3:
                double multiplicacao = num1 * num2;
                System.out.println("Resultado da multiplicação: " + multiplicacao);
                break;
            case 4:
                double divisao = num1 / num2;
                System.out.println("Resultado da divisão: " + divisao);
                break;
            case 5:
                double expoente = Math.pow(num1, num2);
                System.out.println("Resultado da exponenciação: " + expoente);
                break;
            case 6:
                double raiz = Math.sqrt(num1);
                System.out.println("Resultado da raiz quadrada: " + raiz);
                break;
            case 7:
                double seno = Math.sin(num1);
                System.out.println("Resultado do seno: " + seno);
                break;
            case 8:
                double cosseno = Math.cos(num1);
                System.out.println("Resultado do cosseno: " + cosseno);
                break;
            case 9:
                double tangente = Math.tan(num1);
                System.out.println("Resultado da tangente: " + tangente);
                break;
            case 10:
                double logaritmo = Math.log(num1);
                System.out.println("Resultado do logaritmo natural: " + logaritmo);
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
