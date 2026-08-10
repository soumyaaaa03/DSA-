class Solution {
    public boolean winnerSquareGame(int n) {
        // Boolean[] dp = new Boolean[n + 1];
        // return helper(n, dp);
        return tab(n);
    }
    boolean helper(int n, Boolean[] dp) {
        if (n == 0) {
            return false;
        }
        if (dp[n] != null) return dp[n];
        for (int i = 1; i*i <= n; i++) {
            int sq = i * i;
            if (!helper(n - sq, dp)) {
                return dp[n] = true;
            }
        }
        return dp[n] = false;
    }

    boolean tab(int n) {
        boolean[] dp = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                int sq = j * j;
                if (!dp[i - sq]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}