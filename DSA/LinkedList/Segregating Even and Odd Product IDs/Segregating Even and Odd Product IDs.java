import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> even = new LinkedList<>();
        LinkedList<Integer> odd = new LinkedList<>();
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            if(val % 2 == 0){
                even.add(val);
            }
            else{
                odd.add(val);
            }
        }
        even.addAll(odd);
        for(int x : even){
            System.out.print(x + " ");
        }
    }
}
