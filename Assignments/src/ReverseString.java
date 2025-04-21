import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String original = input.nextLine();

        String reversed = "";

        // Reverse the string using a loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Display the reversed string
        System.out.println("Reversed string: " + reversed);

        input.close();
    }
}

