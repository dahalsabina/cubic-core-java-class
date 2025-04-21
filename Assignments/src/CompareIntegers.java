import java.util.Scanner;

public class CompareIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();


        System.out.println("\n--- Comparison Result ---");

        if (num1 == num2) {
            System.out.println(num1 + " == " + num2);
        } else if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        } else {
            System.out.println(num1 + " < " + num2);
        }

        input.close();
    }
}
