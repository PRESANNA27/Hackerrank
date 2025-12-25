import java.util.*;

public class Solution {

    public static int countPalindromes(String s) {
        int count = 0;
        int n = s.length();

        for (int center = 0; center < n; center++) {
            // Odd-length palindromes
            count += expandFromCenter(s, center, center);

            // Even-length palindromes
            count += expandFromCenter(s, center, center + 1);
        }
        return count;
    }

    private static int expandFromCenter(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countPalindromes(s));
    }
}
