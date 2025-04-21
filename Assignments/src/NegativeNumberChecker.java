import java.util.Scanner;

public class NegativeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if number is negative
        if (number < 0) {
            System.out.println("You entered a negative number: " + number);
        }

        input.close();
    }
}

