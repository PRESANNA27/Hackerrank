import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // swap pairs using Collections.swap
        for (int i = 0; i+1< n; i += 2) {
            Collections.swap(list, i, i + 1);
        }

        // print result
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) System.out.print(" ");
        }
    }
}
