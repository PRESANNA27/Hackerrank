import java.util.*;

public class Solution {

    static String[] keypad = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    static List<String> result = new ArrayList<>();

    public static void backtrack(String digits, int index, StringBuilder path) {
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }

        String letters = keypad[digits.charAt(index) - '0'];

        for (char ch : letters.toCharArray()) {
            path.append(ch);
            backtrack(digits, index + 1, path);
            path.deleteCharAt(path.length() - 1); // backtrack
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String digits = sc.nextLine();

        if (digits.length() == 0) {
            System.out.println("[]");
            return;
        }

        backtrack(digits, 0, new StringBuilder());

        // Print in required format
        System.out.print("[");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i != result.size() - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}
