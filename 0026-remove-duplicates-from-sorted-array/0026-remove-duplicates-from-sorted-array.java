class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                int n = nums[i + 1];
                nums[i + 1] = nums[j];
                nums[j] = n;
                i++;
                j++;
            }
            
        }
        return i + 1;
    }
}