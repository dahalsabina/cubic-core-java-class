import java.util.Scanner;

public class HighestScoringStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        input.nextLine(); // Consume newline

        String topStudent = "";
        int highestScore = -1;

        // Loop through each student
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter name of student " + i + ": ");
            String name = input.nextLine();

            System.out.print("Enter score of " + name + ": ");
            int score = input.nextInt();
            input.nextLine();

            if (score > highestScore) {
                highestScore = score;
                topStudent = name;
            }
        }

        // Display result
        System.out.println("\nStudent with the highest score:");
        System.out.println("Name : " + topStudent);
        System.out.println("Score: " + highestScore);

        input.close();
    }
}
