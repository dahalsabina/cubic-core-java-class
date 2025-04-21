import java.io.*;
import java.util.*;

public class DuplicateWordsInFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for file name
        System.out.print("Enter the file name (e.g., names.txt): ");
        String fileName = input.nextLine();

        // To store seen and duplicate words
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                // Split line into words
                String[] words = line.toLowerCase().split("\\s+");

                for (String word : words) {
                    if (seen.contains(word)) {
                        duplicates.add(word);
                    } else {
                        seen.add(word);
                    }
                }
            }

            // Print duplicates
            if (duplicates.isEmpty()) {
                System.out.println("No duplicate words found in the file.");
            } else {
                System.out.println("Duplicate words found:");
                for (String word : duplicates) {
                    System.out.println(word);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        input.close();
    }
}

