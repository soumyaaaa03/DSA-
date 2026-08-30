class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, minind = -1, maxind = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minind = i;
            }
            if (nums[i] > max) {
                max = nums[i];
                maxind = i;
            }
        }
        int bothFront = Math.max(minind, maxind) + 1;
        int bothBack = Math.max(nums.length - minind, nums.length - maxind);
        int minFront = minind + 1 + nums.length - maxind;
        int maxFront = maxind + 1 + nums.length - minind;
        return Math.min(Math.min(bothFront, bothBack), Math.min(minFront, maxFront));

        // boolean maxfront = false;
        // if ((maxind + 1) < (nums.length - maxind)) {
        //     maxfront = true;
        //     maxind += 1; 
        // } else {
        //     maxind = nums.length - maxind;
        // }
        // boolean minfront = false;
        // if ((minind + 1) < (nums.length - minind)) {
        //     minfront = true;
        //     minind += 1; 
        // } else {
        //     minind = nums.length - minind;
        // }
        // if (minfront == maxfront) {
        //     return Math.max(minind, maxind);
        // }
        // return minind + maxind;
    }
}