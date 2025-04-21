import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for the value of n
        System.out.print("Enter a positive number (n): ");
        int n = input.nextInt();

        if (n > 0) {
            int sum = n * (n + 1) / 2;
            System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        } else {
            System.out.println("Please enter a positive number.");
        }

        input.close();
    }
}
