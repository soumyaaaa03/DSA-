class Solution {
    public boolean winnerSquareGame(int n) {
        Boolean[] dp = new Boolean[n + 1];
        return helper(n, dp);
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
}