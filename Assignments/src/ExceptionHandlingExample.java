import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        try {
            System.out.print("Enter numerator: ");
            int num = input.nextInt();

            System.out.print("Enter denominator: ");
            int den = input.nextInt();

            int result = num / den;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }


        try {
            int[] arr = {10, 20, 30};
            System.out.print("Enter index to access (0-2): ");
            int index = input.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds.");
        }

        input.close();
    }
}

