import java.util.Scanner;
import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        // Accept array values
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Display sorted array
        System.out.println("\nNumbers in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        input.close();
    }
}

