import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> st=new Stack<>();
        for (char ch : s.toCharArray()){
            st.push(ch);
        }
        StringBuilder str =new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        System.out.print(str);
    }
}
