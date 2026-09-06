class Solution {
    public int numDistinct(String s, String t) {
        return tab(s, t, s.length(), t.length());
    }
    int helper(String s1, String s2, int i, int j) {
        if (j == 0) return 1;
        if (i == 0) return 0;
        if (s1.charAt(i - 1) == s2.charAt(j - 1)) return helper(s1, s2, i - 1, j - 1) + helper(s1, s2, i - 1, j); 
        else return helper(s1, s2, i - 1, j);
    }

    int tab(String s1, String s2, int n, int m) {
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0 ; i <= n ; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= n ; i++) {
            for (int j = 1 ; j <= m ; j++) {
                dp[i][j] = dp[i - 1][j];
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] += dp[i - 1][j - 1];
                }
            }
        }
        return dp[n][m];
    }
}