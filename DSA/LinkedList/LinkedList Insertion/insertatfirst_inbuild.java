import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        LinkedList<Integer> sll = new LinkedList<Integer>();
        for(int i=0;i<size;i++){
            int a= sc.nextInt();
            sll.addFirst(a);
        }
        for(int a:sll){
            System.out.print(a + " ");
        }
        
    }
}
