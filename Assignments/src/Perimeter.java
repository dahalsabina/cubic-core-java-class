import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Perimeter of Circle
        System.out.print("Enter radius of the circle: ");
        double radius = input.nextDouble();
        double circlePerimeter = 2 * Math.PI * radius;

        // Perimeter of Rectangle
        System.out.print("Enter length of the rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double breadth = input.nextDouble();
        double rectanglePerimeter = 2 * (length + breadth);

        // Perimeter of Triangle
        System.out.print("Enter side 1 of the triangle: ");
        double side1 = input.nextDouble();
        System.out.print("Enter side 2 of the triangle: ");
        double side2 = input.nextDouble();
        System.out.print("Enter side 3 of the triangle: ");
        double side3 = input.nextDouble();
        double trianglePerimeter = side1 + side2 + side3;

        // Display results
        System.out.println("\n--- Perimeter Results ---");
        System.out.println("Perimeter of Circle: " + circlePerimeter);
        System.out.println("Perimeter of Rectangle: " + rectanglePerimeter);
        System.out.println("Perimeter of Triangle: " + trianglePerimeter);

        input.close();
    }
}

