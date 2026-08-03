class Solution {
    public boolean predictTheWinner(int[] nums) {
        return helper(nums, 0, nums.length - 1) >= 0;
    }
    int helper(int[] nums, int i, int j) {
        if (i == j) {
            return nums[i];
        }
        int left = nums[i] - helper(nums, i + 1, j);
        int right = nums[j] - helper(nums, i, j - 1);
        return Math.max(left, right);
    }
}