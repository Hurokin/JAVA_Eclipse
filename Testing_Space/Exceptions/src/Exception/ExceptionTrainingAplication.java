package Exception;

import java.util.Scanner;

public class ExceptionTrainingAplication {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro Numero: ");
        int a = scanner.nextInt();

        System.out.print("Segundo Numero: ");
        int b = scanner.nextInt();

        try {
            int result = divide(a, b);
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return a / b;
    }
}
