class Solution {
    public int tribonacci(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        if (dp.length > 1)
        dp[1] = 1;
        if (dp.length > 2)
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
        }
        return dp[n];
    }
}