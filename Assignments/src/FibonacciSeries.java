import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user how many terms to display
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = input.nextInt();

        int first = 1, second = 1;

        System.out.println("Fibonacci Series:");

        if (n >= 1) System.out.print(first + " ");
        if (n >= 2) System.out.print(second + " ");

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }

        input.close();
    }
}
