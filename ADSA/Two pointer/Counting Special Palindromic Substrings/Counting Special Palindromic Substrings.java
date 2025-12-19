import java.util.*;

public class PalindromicSubstrings {
    
    public static int countPalindromes(String s) {
        int count = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            // Odd length palindromes
            count += expandFromCenter(s, i, i);

            // Even length palindromes
            count += expandFromCenter(s, i, i + 1);
        }

        return count;
    }

    private static int expandFromCenter(String s, int left, int right) {
        int cnt = 0;

        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            cnt++;
            left--;
            right++;
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(countPalindromes(s));
        sc.close();
    }
}
