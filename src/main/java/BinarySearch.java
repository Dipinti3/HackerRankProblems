import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1,2,4,9,11};
        int result = binarySearch(a, 2);
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Elemnt is found at index " + result);
    }

    static int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }
        return -1;
    }

}
