class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int[] dp = new int[stoneValue.length];
        Arrays.fill(dp, -1);
        int n = helper(stoneValue, 0, dp);
        if (n == 0) return "Tie";
        if (n > 0) return "Alice";
        return "Bob";
    }
    int helper(int[] nums, int i, int[] dp) {
        if (i >= nums.length) {
            return 0;
        }
        if (dp[i] != -1) return dp[i];
        int two = Integer.MIN_VALUE;
        int three = Integer.MIN_VALUE;
        int one = nums[i] - helper(nums, i + 1, dp);
        if (i <= nums.length - 2)
        two = (nums[i] + nums[i + 1]) - helper(nums, i + 2, dp);
        if (i <= nums.length - 3)
        three = (nums[i] + nums[i + 1] + nums[i + 2]) - helper(nums, i + 3, dp);
        return dp[i] = Math.max(one, Math.max(two, three));
    }
}