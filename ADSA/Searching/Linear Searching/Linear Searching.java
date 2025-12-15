import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        int[] arr = new int[data];
        
        for(int i=0 ; i<data ;i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        for(int i=0 ; i<data ; i++){
            if(arr[i] == key){
                System.out.print(i);
                System.exit(0);
        }
        
        }
        System.out.print("-1");
    }
}
