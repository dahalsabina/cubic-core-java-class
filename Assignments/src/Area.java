import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter radius of the circle: ");
        double radius = input.nextDouble();
        double circleArea = Math.PI * radius * radius;


        System.out.print("Enter length of the rectangle: ");
        double length = input.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double breadth = input.nextDouble();
        double rectangleArea = length * breadth;


        System.out.print("Enter base of the triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter height of the triangle: ");
        double height = input.nextDouble();
        double triangleArea = 0.5 * base * height;


        System.out.println("\n--- Area Results ---");
        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Triangle: " + triangleArea);

        input.close();
    }
}

