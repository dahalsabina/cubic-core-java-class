import java.util.Scanner;

public class AsciiToChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get ASCII code from user
        System.out.print("Enter an ASCII code (0 to 128): ");
        int ascii = input.nextInt();

        // Check if input is in valid range
        if (ascii >= 0 && ascii <= 128) {
            char character = (char) ascii;
            System.out.println("The character for ASCII code " + ascii + " is: " + character);
        } else {
            System.out.println("Invalid input! Please enter a value between 0 and 128.");
        }

        input.close();
    }
}

