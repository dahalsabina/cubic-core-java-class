import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number (1 to 7): ");
        int day = input.nextInt();

        // Match number to day
        switch (day) {
            case 1:
                System.out.println("Day: Sunday");
                break;
            case 2:
                System.out.println("Day: Monday");
                break;
            case 3:
                System.out.println("Day: Tuesday");
                break;
            case 4:
                System.out.println("Day: Wednesday");
                break;
            case 5:
                System.out.println("Day: Thursday");
                break;
            case 6:
                System.out.println("Day: Friday");
                break;
            case 7:
                System.out.println("Day: Saturday");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

        input.close();
    }
}

