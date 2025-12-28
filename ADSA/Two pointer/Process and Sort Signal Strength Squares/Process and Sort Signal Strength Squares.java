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
        
        int result[] = new int[n];
        for(int i=0;i<n;i++){
            int a = arr[i];
            result[i] = a*a;
        }
        Arrays.sort(result);
        
         
        for(int a:result){
            System.out.print(a+" ");
        }
    }
}
