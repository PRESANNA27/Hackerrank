import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] money = new int[n];

        for (int i = 0; i < n; i++) {
            money[i] = sc.nextInt();
        }

        // Edge case
        if (n == 1) {
            System.out.println(money[0]);
            return;
        }

        int[] dp = new int[n];

        dp[0] = money[0];
        dp[1] = Math.max(money[0], money[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], money[i] + dp[i - 2]);
        }

        System.out.println(dp[n - 1]);
        sc.close();
    }
}
