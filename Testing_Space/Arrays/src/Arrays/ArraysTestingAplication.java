package Arrays;

public class ArraysTestingAplication {
	 public static void main(String[] args) {
	        // Criar um array de inteiros
	        int[] numbers = {10, 20, 30, 40, 50};

	        // Imprimir o array
	        printArray(numbers);

	        // Encontrar o maior valor no array
	        int maxValue = findMax(numbers);
	        System.out.println("\nO maior valor é: " + maxValue);

	        // Calcular a soma dos elementos do array
	        int sum = calculateSum(numbers);
	        System.out.println("A soma dos elementos é: " + sum);

	        // Criar uma cópia do array
	        int[] copyOfNumbers = copyArray(numbers);
	        System.out.print("\nCópia do array: ");
	        printArray(copyOfNumbers);

			 // Criar uma cópia inversa do array
		     int[] reversedNumbers = reverseArray(numbers);
		     System.out.print("\nCópia inversa do array: ");
		     printArray(reversedNumbers);
 }

	 		
	 
	    public static void printArray(int[] arr) {
	        System.out.print("Array: ");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }

	    public static int findMax(int[] arr) {
	        int max = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }
	        return max;
	    }

	    public static int calculateSum(int[] arr) {
	        int sum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	        }
	        return sum;
	    }

	    public static int[] copyArray(int[] arr) {
	        int[] copy = new int[arr.length];
	        for (int i = 0; i < arr.length; i++) {
	            copy[i] = arr[i];
	        }
	        return copy;
	    }
	    public static int[] reverseArray(int[] arr) {
	        int[] reversed = new int[arr.length];
	        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
	            reversed[i] = arr[j];
	        }
	        return reversed;
	    }
}
