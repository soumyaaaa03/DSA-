class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        //for (int l = 0; l < nums.length; l++) {
            int i = 0, j = 0;
            while (j < nums.length) {
                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
                if (map.get(nums[j]) > k) {
                    while (nums[i] != nums[j]) {
                        map.put(nums[i], map.get(nums[i]) - 1);
                        i++;
                    }
                    i++;
                    map.put(nums[j], map.get(nums[j]) - 1);
                } else {
                    max = Math.max(max, j - i + 1);
                }
                j++;
            }
       // }
        return max;
     }
}