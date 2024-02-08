import java.util.Scanner;
public class assignment_02_073 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaring arrays for even and odd numbers
        int[] even;
        int[] odd;
        // Initialize counts for even and odd numbers
        int evenCount = 0;
        int oddCount = 0;

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Creating arrays based on the number of elements entered by the user
        even = new int[n];
        odd = new int[n];

        // Accepting numbers from the user and moving them to respective arrays
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                even[evenCount++] = num;
            } else {
                odd[oddCount++] = num;
            }
        }

        // Displaying even numbers
        System.out.println("Even numbers:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(even[i] + " ");
        }

        // Displaying odd numbers
        System.out.println("\nOdd numbers:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(odd[i] + " ");
        }

        scanner.close();
    }
}






import java.util.Scanner;

public class assignment_02_part_02 {
    public static int findNearestIndex(int[] arr) {
        if (arr == null || arr.length < 2) {
            // Handle edge cases where the array is empty or has only one element
            return -1;
        }

        int minDistance = Integer.MAX_VALUE;
        int nearestIndex = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            int distance = Math.abs(arr[i] - arr[i + 1]);
            if (distance < minDistance) {
                minDistance = distance;
                nearestIndex = i;
            }
        }

        return nearestIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int nearestIndex = findNearestIndex(arr);
        if (nearestIndex != -1) {
            System.out.println("Nearest neighbours are at index " + nearestIndex + " and " + (nearestIndex + 1));
        } else {
            System.out.println("Array is empty or has only one element.");
        }

        scanner.close();
    }
}






import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class assignment_02_part_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array from the user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        Integer[] array = new Integer[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = Integer.valueOf(scanner.nextInt());
        }

        // Convert array to ArrayList
        List<Integer> arrayList = Arrays.asList(array);

        System.out.println("Array converted to ArrayList:");
        System.out.println(arrayList);

        // Input ArrayList from the user
        System.out.print("\nEnter the number of elements in the ArrayList: ");
        int m = scanner.nextInt();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>(); // Specify the type explicitly
        System.out.println("Enter the elements of the ArrayList:");
        for (int i = 0; i < m; i++) {
            arrayList2.add(Integer.valueOf(scanner.nextInt()));
        }

        // Convert ArrayList to array
        Integer[] array2 = arrayList2.toArray(new Integer[arrayList2.size()]); // Specify the type explicitly

        System.out.println("\nArrayList converted to array:");
        System.out.println(Arrays.toString(array2));

        scanner.close();
    }
}
