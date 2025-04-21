import java.util.Scanner;

public class DigitSumProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;
        int product = 1;
        int originalNumber = number;

        // Loop through each digit
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }

        // Display results
        System.out.println("Sum of digits of " + originalNumber + " is: " + sum);
        System.out.println("Product of digits of " + originalNumber + " is: " + product);

        input.close();
    }
}

