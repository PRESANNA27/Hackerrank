import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size;i++){
            arr[i] = sc.nextInt();
        }
        int count = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i=0;i<size ;i++){
            list.add(arr[i]);
        }
        for(int i=0;i<count && !list.isEmpty();i++){
            list.removeFirst();
        }
        if(list.isEmpty()){
            System.out.print("List is empty");
        }
        else{
            for(int val : list){
                System.out.print(val+" ");
            }
        }
    }
}
