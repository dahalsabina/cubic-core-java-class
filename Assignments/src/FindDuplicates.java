import java.util.Scanner;

public class FindDuplicates {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        int[] array = new int[n];

        // Accept array elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        // Call function to find duplicates
        findDuplicates(array);

        input.close();
    }

    // Function to find and print duplicate elements
    public static void findDuplicates(int[] arr) {
        boolean found = false;

        System.out.println("Duplicate elements:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No duplicate elements found.");
        }
    }
}

