import java.util.*;

public class MatrixChainMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }

        int n = list.size();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = list.get(i);
        }

        int[][] dp = new int[n][n];

        for (int L = 2; L < n; L++) {
            for (int i = 1; i < n - L + 1; i++) {
                int j = i + L - 1;
                dp[i][j] = Integer.MAX_VALUE;

                for (int k = i; k < j; k++) {
                    int cost = dp[i][k] + dp[k + 1][j]
                            + arr[i - 1] * arr[k] * arr[j];

                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }

        System.out.println(dp[1][n - 1]);
    }
}
