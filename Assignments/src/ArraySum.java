import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5]; // Array to store 5 numbers
        int sum = 0;

        // Input 5 values
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            sum += numbers[i]; // Add to sum
        }

        // Display the sum
        System.out.println("Sum of the 5 numbers is: " + sum);

        input.close();
    }
}

