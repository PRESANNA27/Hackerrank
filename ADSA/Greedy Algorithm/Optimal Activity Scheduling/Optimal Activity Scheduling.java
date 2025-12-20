import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] start = new int[size];
        int[] end = new int[size];

        for (int i = 0; i < size; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (end[i] > end[j]) {
                    int temp = end[i];
                    end[i] = end[j];
                    end[j] = temp;

                    temp = start[i];
                    start[i] = start[j];
                    start[j] = temp;
                }
            }
        }

        int count = 0;
        int lastEnd = -1;

        for (int i = 0; i < size; i++) {
            if (start[i] >= lastEnd) {
                count++;
                lastEnd = end[i];
            }
        }

        System.out.println(count);
    }
}
