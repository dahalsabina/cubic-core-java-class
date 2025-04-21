import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Converted to Celsius: " + celsius);


        System.out.print("Enter temperature in Celsius: ");
        celsius = input.nextDouble();
        fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println("Converted to Fahrenheit: " + fahrenheit);

        input.close();
    }
}

