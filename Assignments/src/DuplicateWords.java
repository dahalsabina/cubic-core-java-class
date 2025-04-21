import java.util.Scanner;
import java.util.HashSet;

public class DuplicateWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input a long sentence
        System.out.print("Enter a long string: ");
        String sentence = input.nextLine().toLowerCase(); // Case-insensitive

        String[] words = sentence.split("\\s+"); // Split by whitespace
        HashSet<String> seen = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();

        System.out.println("\nDuplicate words:");

        for (String word : words) {
            if (seen.contains(word)) {
                duplicates.add(word);
            } else {
                seen.add(word);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicate words found.");
        } else {
            for (String word : duplicates) {
                System.out.println(word);
            }
        }

        input.close();
    }
}
