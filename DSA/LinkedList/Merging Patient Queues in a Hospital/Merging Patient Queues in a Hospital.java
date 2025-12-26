import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList <Integer> list1 = new LinkedList<Integer>();
        for(int i=0;i<n;i++){
            list1.add(sc.nextInt());
        }
        int m = sc.nextInt();
        LinkedList <Integer> list2 = new LinkedList<Integer>();
        for(int i=0;i<m;i++){
            list2.add(sc.nextInt());
        }
        list1.addAll(list2);
        Collections.sort(list1);
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i));
            if(i < list1.size() -1) System.out.print(" ");
        }
    }
}
