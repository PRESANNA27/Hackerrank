import java.util.*;

public class Solution {

    // Merge two sorted subarrays into one
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1; // size of left subarray
        int n2 = right - mid;    // size of right subarray

        // temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // copy data into temporary arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // merge L[] and R[]
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // copy remaining elements
        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    // Recursive Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // sort left half
            mergeSort(arr, left, mid);

            // sort right half
            mergeSort(arr, mid + 1, right);

            // merge sorted halves
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // number of students
        int n = sc.nextInt();
        int[] arr = new int[n];

        // scores
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // sort using merge sort
        mergeSort(arr, 0, n - 1);

        // print result
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
