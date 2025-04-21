import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        input.close();
    }
}

