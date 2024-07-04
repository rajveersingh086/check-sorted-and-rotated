package geeks.array;
import java.util.*;
//RAJVEER SINGH
// COMPELXITY = O(n)
public class checksort_rotated {


    public static boolean checkRotatedAndSorted(int arr[], int num) {
        if (num < 2) {
            return false; // Single element or empty array cannot be sorted and rotated
        }

        int countIncreasing = 0;
        int countDecreasing = 0;

        for (int i = 0; i < num; i++) {
            if (arr[i] > arr[(i + 1) % num]) {
                countIncreasing++;
            }
        }

        for (int i = 0; i < num; i++) {
            if (arr[i] < arr[(i + 1) % num]) {
                countDecreasing++;
            }
        }

        return (countIncreasing == 1 || countDecreasing == -1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = checkRotatedAndSorted(arr, num);
        System.out.println(  result);
    }
}

