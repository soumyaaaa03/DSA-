class Solution {

    int[][] dp;
    int[] suffix;

    public int stoneGameII(int[] piles) {
        int n = piles.length;

        dp = new int[n][n + 1];
        suffix = new int[n + 1];

        // Suffix sum
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + piles[i];
        }

        return solve(0, 1, piles);
    }

    int solve(int i, int M, int[] piles) {

        // No piles left
        if (i >= piles.length) {
            return 0;
        }

        // Already calculated
        if (dp[i][M] != 0) {
            return dp[i][M];
        }

        int maxStones = 0;

        // Take X piles, where 1 <= X <= 2*M
        for (int X = 1; X <= 2 * M && i + X <= piles.length; X++) {

            int newM = Math.max(M, X);

            // Opponent's best result
            int opponent = solve(i + X, newM, piles);

            // Total remaining - opponent's stones
            int current = suffix[i] - opponent;

            maxStones = Math.max(maxStones, current);
        }

        return dp[i][M] = maxStones;
    }
}