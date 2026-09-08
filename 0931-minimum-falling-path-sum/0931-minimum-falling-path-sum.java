class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int ans = Integer.MAX_VALUE;
        int[][] dp = new int[matrix.length][matrix.length];
        for (int[] arr : dp) {
            Arrays.fill(arr, Integer.MAX_VALUE);
        }
        for (int i = 0; i < matrix.length; i++) {
            ans = Math.min(ans, helper(matrix, 0, i, dp));
        }
        return ans;
    }
    int helper(int[][] mat, int r, int c, int[][] dp) {
        if (r == mat.length - 1) {
            return mat[r][c];
        }
        if (dp[r][c] != Integer.MAX_VALUE) return dp[r][c];
        int left = Integer.MAX_VALUE;
        if ((c - 1) >= 0) {
            left = helper(mat, r + 1, c - 1, dp);
        }
        int down = helper(mat, r + 1, c, dp);
        int right = Integer.MAX_VALUE;
        if ((c + 1) < mat.length) {
            right = helper(mat, r + 1, c + 1, dp);
        }
        return dp[r][c] = mat[r][c] + Math.min(left, Math.min(down, right));
    }

    // int tab(int[][] mat) {
    //     int[][] dp = new int[mat.length + 1][mat.length + 1];
    //     for (int i = 0; i < mat.length; i++) {
    //         dp[0][i] = mat[0][i];
    //     }
    //     for (int i = 1; i < mat.length; i++) {
    //         for (int j = 0; j < mat.length; j++) {
    //             dp[i]
    //         }
    //     }
    // }
}