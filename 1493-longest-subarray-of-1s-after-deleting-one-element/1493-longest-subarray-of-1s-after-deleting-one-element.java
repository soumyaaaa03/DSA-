class Solution {
    public int longestSubarray(int[] nums) {
        int cnt = 0;
        int max = Integer.MIN_VALUE;
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[j] == 0)
                cnt++;

            while (cnt > 1) {
                if (nums[i] == 0)
                    cnt--;
                i++;
            }

            max = Math.max(max, j - i);
            j++;
        }
        return max;
    }
}


