import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] part = line.trim().split("\\s+");
        int n = part.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(part[i]);
        }
        int k = sc.nextInt();
        k = k%n;
        int[] rotate =new int[n];
        for(int i=0;i<n;i++){
            rotate[(i+k)%n] = arr[i];
        }
        for(int i =0;i<n;i++){
            System.out.print(rotate[i]+ " ");
        }
    }
}
