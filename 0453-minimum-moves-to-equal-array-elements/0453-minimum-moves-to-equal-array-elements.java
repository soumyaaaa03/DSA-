class Solution {
    public int minMoves(int[] nums) {
        int min = min(nums);
        int ans = 0;
        for (int n : nums) {
            if (n > min) {
                ans += n - min;
            }
        }
        return ans;
    }
    int min(int[] arr) {
        int ans = Integer.MAX_VALUE;
        for (int n : arr) {
            if (ans > n)
            ans = n;
        }
        return ans;
    }
}