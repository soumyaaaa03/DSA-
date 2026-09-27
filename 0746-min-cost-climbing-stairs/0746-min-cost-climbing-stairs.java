class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        int[] dp = new int[n + 1];

        dp[n] = 0;

        dp[n - 1] = cost[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            dp[i] = cost[i] + Math.min(dp[i + 1], dp[i + 2]);
        }

        return Math.min(dp[0], dp[1]);


        // int[] dp = new int[cost.length];
        // Arrays.fill(dp, -1);
        // int z = helper(cost, 0, dp);
        // int o = helper(cost, 1, dp);
        // return Math.min(z, o);
    }
    int helper(int[] arr, int i, int cost) {
        if (i >= arr.length) {
            return cost;
        }
        int one = helper(arr, i + 1, cost + (i + 1 < arr.length ? arr[i + 1] : 0));
        int two = helper(arr, i + 2, cost + (i + 2 < arr.length ? arr[i + 2] : 0));
        return Math.min(one, two);
    }
    private int helper(int[] cost, int i, int[] dp) {

        // Reached or crossed the top
        if (i >= cost.length) {
            return 0;
        }

        // Already calculated
        if (dp[i] != -1) {
            return dp[i];
        }

        int oneStep = helper(cost, i + 1, dp);
        int twoStep = helper(cost, i + 2, dp);

        dp[i] = cost[i] + Math.min(oneStep, twoStep);

        return dp[i];
    }
    // int tab(int[] arr) {
    //     int[] dp = new int[arr.length + 1];
    //     dp[0] = arr[0];
    //     dp[1] = arr[1];
    //     for (int i = 2; i <= arr.length; i++) {
        
    //     }
    // }
}