import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input values
        System.out.print("Enter first number (a): ");
        int a = input.nextInt();

        System.out.print("Enter second number (b): ");
        int b = input.nextInt();

        // Swap using temp
        System.out.println("\n--- Swapping using temp variable ---");
        swapWithTemp(a, b);

        // Swap without temp
        System.out.println("\n--- Swapping without temp variable ---");
        swapWithoutTemp(a, b);

        input.close();
    }

    // Method to swap using a temporary variable
    public static void swapWithTemp(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    // Method to swap without using a temporary variable
    public static void swapWithoutTemp(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}

