class Solution {
    public int minDeletion(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < nums.length;) {
            if ((i + 1) <nums.length && nums[i] == nums[i + 1]) {
                ans++;
                n--;
                i++;
            } else if ((i + 1) <nums.length && nums[i] != nums[i + 1]) {
                i += 2;
            } else {
                i++;
            }
        }
        if (n % 2 == 0) {
            return ans;
        }
        return (ans + 1);
    }
}