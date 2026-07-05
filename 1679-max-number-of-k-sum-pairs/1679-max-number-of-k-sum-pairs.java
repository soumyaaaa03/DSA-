class Solution {
    public int maxOperations(int[] nums, int k) {
        int cnt = 0;
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
        return cnt;
    }
}