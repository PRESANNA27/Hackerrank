import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i =0 ;i<n;i++){
            list.add(arr[i]);
        }
        list.remove(n-k);
        for(int i:list){
            System.out.print(i+" ");
        }
    }
}
