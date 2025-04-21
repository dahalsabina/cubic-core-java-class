import java.util.Scanner;

public class SecondLargestFinder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        if (n < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int[] array = new int[n];

        // Accept array elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        // Call function to find second largest
        int secondLargest = findSecondLargest(array);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("All elements are the same. No second largest.");
        } else {
            System.out.println("Second largest number is: " + secondLargest);
        }

        input.close();
    }

    // Function to find second largest number
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;
            }
        }

        return second;
    }
}

