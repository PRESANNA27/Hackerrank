import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int temp = arr[k-1];
        arr[k-1] = arr[n - k];
        arr[n - k] = temp;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            if(i <n-1) System.out.print(" ");
        }
    }
}
