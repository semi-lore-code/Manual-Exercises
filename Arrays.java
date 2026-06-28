import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ===== 1. Array Sum =====
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            // Be cautious of ArrayIndexOutOfBoundsException — we use i < size, not i <= size
            arr[i] = scanner.nextInt();
        }

        // Enhanced for loop for simple iteration
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        System.out.println("\n--- Array Sum ---");
        System.out.println("Sum = " + sum);


        // ===== 2. Max Element =====
        int max = arr[0]; // start with first element
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println("\n--- Max Element ---");
        System.out.println("Maximum value = " + max);


        // ===== 3. Matrix Addition =====
        System.out.println("\n--- Matrix Addition ---");
        System.out.print("Enter matrix size (rows and cols): ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matA = new int[rows][cols];
        int[][] matB = new int[rows][cols];
        int[][] result = new int[rows][cols];

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matA[i][j] = scanner.nextInt();

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matB[i][j] = scanner.nextInt();

        // Add matrices
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = matA[i][j] + matB[i][j];

        System.out.println("Result of A + B:");
        for (int[] row : result) {           // enhanced for loop on 2D array
            for (int val : row) {
                System.out.printf("%4d", val); // neat column formatting
            }
            System.out.println();
        }


        // ===== 4. Array Reversal (in place) =====
        System.out.println("\n--- Array Reversal ---");
        System.out.print("Original: ");
        for (int x : arr) System.out.print(x + " ");

        // Swap from both ends moving inward — no extra array needed
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.print("\nReversed: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();

        scanner.close();
    }
}