import java.util.Arrays;

public class ArraySortExample {
    public static void main(String[] args) {
        // Sample array
        int[] arrayToSort = {5, 2, 8, 1, 3};

        // Call the sort method from Arrays class
        Arrays.sort(arrayToSort);

        // Display the sorted array
        System.out.println("Sorted Array in Ascending Order: " + Arrays.toString(arrayToSort));
    }
}
