import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number to reverse: ");
        int number = input.nextInt();

        int reversed = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        // Display the result
        System.out.println("Reversed number: " + reversed);

        input.close();
    }
}
