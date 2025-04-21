import java.util.Scanner;

public class PrimeFunctions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Test isPrimeNumber
        System.out.print("Enter a number to check if it's prime: ");
        int number = input.nextInt();
        if (isPrimeNumber(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Test firstNthPrime
        System.out.print("\nEnter how many prime numbers you want to print: ");
        int n = input.nextInt();
        System.out.println("First " + n + " prime numbers:");
        firstNthPrime(n);

        // Test allPrimeBetween
        System.out.print("\nEnter start of range: ");
        int start = input.nextInt();
        System.out.print("Enter end of range: ");
        int end = input.nextInt();
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        allPrimeBetween(start, end);

        input.close();
    }

    // Function to check if a number is prime
    public static boolean isPrimeNumber(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Function to print the first n prime numbers
    public static void firstNthPrime(int n) {
        int count = 0;
        int num = 2;

        while (count < n) {
            if (isPrimeNumber(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }

    // Function to print all prime numbers between two numbers
    public static void allPrimeBetween(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

