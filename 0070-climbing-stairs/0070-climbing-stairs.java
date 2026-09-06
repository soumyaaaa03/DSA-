class Solution {
    public int climbStairs(int n) {
        // int[] dp = new int[n + 1];
        // Arrays.fill(dp, -1);
        // return helper(n, 0, dp);
        return tab(n);
    }

    int helper(int n, int i, int[] dp) {
        if (n < i) return 0;
        if (n == i) return 1;
        if (dp[i] != -1) return dp[i];
        int one = helper(n, i + 1, dp);
        int two = helper(n, i + 2, dp);
        return dp[i] = one + two;
    }

    int tab(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}















