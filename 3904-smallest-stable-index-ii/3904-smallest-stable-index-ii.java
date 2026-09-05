class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] min = new int[nums.length];
        //int[] max = new int[nums.length];
        
        int ma = Integer.MIN_VALUE;
        int mi = Integer.MAX_VALUE;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] > ma) {
        //         ma = nums[i];
        //     }
        //     max[i] = ma;
        // }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < mi) {
                mi = nums[i];
            }
            min[i] = mi;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > ma) {
                ma = nums[i];
            }
            if ((ma - min[i]) <= k) {
                return i;
            }
        }
        
        return -1;
    
    }
}