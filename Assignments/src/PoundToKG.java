import java.util.Scanner;

public class PoundToKG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();


        double kilograms = pounds * 0.454;


        System.out.println("Equivalent weight in kilograms: " + kilograms);

        input.close();
    }
}

