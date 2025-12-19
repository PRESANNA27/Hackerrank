import java.util.*;

public class Main {

    static int expand(String s, int left, int right) {
        int count = 0;

        while (left >= 0 && right < s.length() &&
               s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            ans += expand(s, i, i);     // odd length
            ans += expand(s, i, i + 1); // even length
        }

        System.out.println(ans);
    }
}
