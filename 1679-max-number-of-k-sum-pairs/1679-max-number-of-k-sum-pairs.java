class Solution {
    public int maxOperations(int[] nums, int k) {
        int cnt = 0;
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == k) {
                cnt++;
                i++;
                j--;
            } else if (sum < k) {
                i++;
            } else {
                j--;
            }
        }
        return cnt;
        
        
        /*int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = k - nums[i];
            if (map.containsKey(n)) {
                map.put(n, map.getOrDefault(n, 0) - 1);
                map.remove(n, 0);
                cnt++;
            } else {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        return cnt;*/
    }
}