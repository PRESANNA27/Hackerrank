import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            System.out.print(list.get(i)+ " ");
        }
        
    }
}
