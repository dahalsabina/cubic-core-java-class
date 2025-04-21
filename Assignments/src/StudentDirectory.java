import java.io.*;
import java.util.Scanner;

public class StudentDirectory {
    static final String FILE_NAME = "students.txt";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Write names and addresses of 10 students into a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            System.out.println("Enter name and address of 10 students:");

            for (int i = 1; i <= 10; i++) {
                System.out.print("Enter name of student " + i + ": ");
                String name = input.nextLine();

                System.out.print("Enter address of " + name + ": ");
                String address = input.nextLine();

                writer.write(name + ":" + address);
                writer.newLine();
            }
            System.out.println("Student data saved to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return;
        }

        // Step 2: Search for a student by name
        System.out.print("\nEnter a name to search for address: ");
        String searchName = input.nextLine();
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2 && parts[0].equalsIgnoreCase(searchName)) {
                    System.out.println("Address of " + parts[0] + ": " + parts[1]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("No student found with the name: " + searchName);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }

        input.close();
    }
}
