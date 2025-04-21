import java.util.Scanner;

public class MathFunctions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Call all three functions one after another
        motionEquation(input);
        heronsFormula(input);
        quadraticFormula(input);

        input.close();
    }

    // Method for Equation of Motion: s = ut + 1/2 * a * t^2
    public static void motionEquation(Scanner input) {
        System.out.println("\n--- Equation of Motion ---");
        System.out.print("Enter initial velocity (u): ");
        double u = input.nextDouble();

        System.out.print("Enter acceleration (a): ");
        double a = input.nextDouble();

        System.out.print("Enter time (t): ");
        double t = input.nextDouble();

        double s = u * t + 0.5 * a * t * t;
        System.out.println("Displacement (s): " + s);
    }

    // Method for Heron's Formula: Area = √(s(s-a)(s-b)(s-c))
    public static void heronsFormula(Scanner input) {
        System.out.println("\n--- Heron's Formula ---");
        System.out.print("Enter side a: ");
        double a = input.nextDouble();

        System.out.print("Enter side b: ");
        double b = input.nextDouble();

        System.out.print("Enter side c: ");
        double c = input.nextDouble();

        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of triangle: " + area);
    }

    // Method for Quadratic Formula: x = (-b + √(b² - 4ac)) / 2a
    public static void quadraticFormula(Scanner input) {
        System.out.println("\n--- Quadratic Formula ---");
        System.out.print("Enter coefficient a: ");
        double a = input.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = input.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant >= 0) {
            double x = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("One root of the quadratic equation: " + x);
        } else {
            System.out.println("No real roots (discriminant < 0).");
        }
    }
}
