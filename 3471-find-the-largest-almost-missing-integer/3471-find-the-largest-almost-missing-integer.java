class Solution {
    public int largestInteger(int[] nums, int k) {

        int n = nums.length;

        // Only one subarray: whole array
        if (k == n) {
            int ans = -1;

            for (int x : nums) {
                ans = Math.max(ans, x);
            }

            return ans;
        }

        // k == 1
        // Every element itself is a subarray.
        if (k == 1) {
            int[] freq = new int[51];

            for (int x : nums) {
                freq[x]++;
            }

            int ans = -1;

            for (int x = 0; x <= 50; x++) {
                if (freq[x] == 1) {
                    ans = x;
                }
            }

            return ans;
        }

        // 1 < k < n
        int[] freq = new int[51];

        for (int x : nums) {
            freq[x]++;
        }

        int ans = -1;

        // First element
        if (freq[nums[0]] == 1) {
            ans = Math.max(ans, nums[0]);
        }

        // Last element
        if (freq[nums[n - 1]] == 1) {
            ans = Math.max(ans, nums[n - 1]);
        }

        return ans;
    }
}