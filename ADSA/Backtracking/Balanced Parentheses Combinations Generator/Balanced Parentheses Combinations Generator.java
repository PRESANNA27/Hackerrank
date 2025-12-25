import java.util.*;

public class Solution {

    static List<String> result = new ArrayList<>();

    public static void backtrack(int open, int close, int n, StringBuilder sb) {
        // Base case: valid combination formed
        if (sb.length() == 2 * n) {
            result.add(sb.toString());
            return;
        }

        // Add opening bracket if possible
        if (open < n) {
            sb.append('(');
            backtrack(open + 1, close, n, sb);
            sb.deleteCharAt(sb.length() - 1);
        }

        // Add closing bracket if valid
        if (close < open) {
            sb.append(')');
            backtrack(open, close + 1, n, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        backtrack(0, 0, n, new StringBuilder());

        // Print output in required format
        System.out.print("[");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i != result.size() - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}
