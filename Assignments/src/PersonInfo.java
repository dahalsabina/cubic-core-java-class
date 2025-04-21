import java.util.Scanner;

public class PersonInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Enter your nationality: ");
        String nationality = input.nextLine();


        System.out.println("\n--- Person Information ---");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Nationality: " + nationality);

        input.close();
    }
}

