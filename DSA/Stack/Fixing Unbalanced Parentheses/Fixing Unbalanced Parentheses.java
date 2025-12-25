import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // consume newline

        while (T-- > 0) {
            String s = sc.nextLine();
            int open = 0;
            int add = 0;

            for (char c : s.toCharArray()) {
                if (c == '(') {
                    open++;
                } else { // ')'
                    if (open > 0) {
                        open--;
                    } else {
                        add++; // need extra '('
                    }
                }
            }

            // open = number of missing ')'
            System.out.println(add + open);
        }
    }
}
