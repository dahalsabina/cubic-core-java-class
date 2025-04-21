import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input n
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        double sum = 1.0;

        for (int i = 2; i <= n; i++) {
            sum += (double) i / factorial(i);
        }

        // Output the result
        System.out.println("The result of the series is: " + sum);

        input.close();
    }

    // Method to calculate factorial
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}

