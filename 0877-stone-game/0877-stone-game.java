class Solution {
    public boolean stoneGame(int[] piles) {
        int[][] dp = new int[piles.length + 1][piles.length + 1];
        for (int[] d : dp) {
            Arrays.fill(d, -1);
        }
        return helper(piles, 0, piles.length - 1, dp) > 0;
    }
    int helper(int[] nums, int i, int j, int[][] dp) {
        if (i >= j) {
            return nums[i];
        }
        if (dp[i][j] != -1) return dp[i][j];
        int left = nums[i] - helper(nums, i + 1, j, dp);
        int right = nums[j] - helper(nums, i, j - 1, dp);
        return dp[i][j] = Math.max(left, right);
    }
}