package Matriz;

import java.util.Scanner;

public class SimplesTestAplication {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de linhas: ");
        int rows = scanner.nextInt();

        System.out.print("Número de colunas: ");
        int columns = scanner.nextInt();

        System.out.print("Intervalo de preenchimento (min-max): ");
        int min = scanner.nextInt();
        int max = scanner.nextInt();

        int[][] matrix = generateMatrix(rows, columns, min, max);
        printMatrix(matrix);
    }

    public static int[][] generateMatrix(int rows, int columns, int min, int max) {
        int[][] matrix = new int[rows][columns];

        // Preencher a matriz com valores aleatórios dentro do intervalo
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * (max - min + 1)) + min;
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        // Imprimir a matriz
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
