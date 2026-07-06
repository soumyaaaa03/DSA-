class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = 0;
        double max = 0;
        for (int i = 0; i < k; i++) {
            ans += nums[i];
        }
        max = ans/k;
        int i = 0, j = k;
        while (j < nums.length) {
            ans -= nums[i];
            ans += nums[j];
            max = Math.max(max, (ans/k));
            i++;
            j++;
        }
        return max;
    }
}