class Solution {
    int totalSum;
    public int lastStoneWeightII(int[] stones) {
        totalSum = 0;
        for (int n : stones) {
            totalSum += n;
        }
        int[][] dp = new int[stones.length][totalSum + 1];
        for (int i = 0; i < stones.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(stones, 0, 0, dp);
    }
    int helper(int[] arr, int index, int currsum, int[][] dp) {
        if (index == arr.length) {
            return Math.abs(totalSum - 2*currsum);
        }
        if (dp[index][currsum] != -1) return dp[index][currsum];
        int take = helper(arr, index + 1, currsum + arr[index], dp);
        int notTake = helper(arr, index + 1, currsum, dp);
        return dp[index][currsum] = Math.min(take, notTake);
    }
}