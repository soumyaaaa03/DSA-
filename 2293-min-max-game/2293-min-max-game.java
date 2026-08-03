class Solution {
    public int minMaxGame(int[] nums) {
        while (nums.length > 1) {
            int[] arr = new int[nums.length / 2];
            int k = 0;
            for (int i = 0; i < nums.length; i += 2) {
                if (k % 2 == 0) {
                    arr[k++] = Math.min(nums[i], nums[i + 1]);
                } else {
                    arr[k++] = Math.max(nums[i], nums[i + 1]);
                }
            }
            nums = arr;
        }
        return nums[0];
    }
}