import java.util.Scanner;

public class TriangleTypeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input three sides
        System.out.print("Enter side a: ");
        int a = input.nextInt();

        System.out.print("Enter side b: ");
        int b = input.nextInt();

        System.out.print("Enter side c: ");
        int c = input.nextInt();

        // Check if it's a valid triangle first
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("The triangle is Equilateral.");
            } else if (a == b || b == c || a == c) {
                System.out.println("The triangle is Isosceles.");
            } else {
                System.out.println("The triangle is Scalene.");
            }
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }

        input.close();
    }
}

