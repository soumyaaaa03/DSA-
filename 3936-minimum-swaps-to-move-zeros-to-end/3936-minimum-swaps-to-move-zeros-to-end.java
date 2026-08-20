class Solution {
    public int minimumSwaps(int[] nums) {
        int cnt = 0, s = 0, e = nums.length - 1;
        while (e >= 0 && nums[e] == 0 ) {
            e--;
        }
        while (s < e) {
            if (nums[e] == 0) {
                e--;
            }else if (nums[s] == 0) {
                
                e--;
                s++;
                cnt++;
            } else {
                s++;
            }
        } 
        return cnt;
    }
}