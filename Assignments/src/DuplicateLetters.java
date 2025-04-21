import java.util.Scanner;

public class DuplicateLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input a word
        System.out.print("Enter a word: ");
        String word = input.nextLine().toLowerCase();

        // Convert to character array
        char[] letters = word.toCharArray();
        boolean[] visited = new boolean[letters.length];

        System.out.println("Duplicate letters:");

        boolean hasDuplicates = false;

        for (int i = 0; i < letters.length; i++) {
            if (visited[i]) continue;

            int count = 1;

            for (int j = i + 1; j < letters.length; j++) {
                if (letters[i] == letters[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(letters[i]);
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate letters found.");
        }

        input.close();
    }
}
