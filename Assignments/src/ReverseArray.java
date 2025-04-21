import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] array = new int[n];

        // Accept elements into array
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        // Display reversed array
        System.out.println("\nReversed array:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        input.close();
    }
}

