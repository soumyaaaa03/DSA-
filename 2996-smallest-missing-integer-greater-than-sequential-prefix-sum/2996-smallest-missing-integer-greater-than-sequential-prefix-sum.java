class Solution {
    public int missingInteger(int[] nums) {
        // if (nums.length == 1) {
        //     return nums[0] + 1;
        // }
        int sum = nums[0];
        int ind = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                ind = i;
                break;
            }
        }
        boolean found = true;

        while (found) {

            found = false;

            for (int num : nums) {
                if (num == sum) {
                    sum++;
                    found = true;
                    break;
                }
            }
        }
        return sum;


        // int i = 0, j = 1;
        // int si = i, se = j;
        //int max = 0;
        // while (j < nums.length) {
        //     if (nums[j] == nums[j - 1] + 1) {
        //         //j++;
        //         if (max < (j - i + 1)) {
        //             si = i;
        //             se = j;
        //             max = j - i + 1;
        //         }
        //         j++;
        //     } else {
        //         i = j;
        //         j++;
        //     }
        // }
        // int sum = 0;
        // for (int k = si; k <= se; k++) {
        //     sum += nums[k];
        // }
        // //Arrays.sort(nums);
        // for (int k = 0; k < nums.length; k++) {
        //     if (nums[k] == sum) {
        //         sum += 1;
        //     }
        // }
        // return sum;
    }
}