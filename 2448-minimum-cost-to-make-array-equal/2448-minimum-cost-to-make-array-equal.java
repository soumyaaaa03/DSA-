class Solution {
    public long minCost(int[] nums, int[] cost) {
        int[][] arr = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = cost[i];
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        long totalWeight = 0;
        for (int i = 0; i < nums.length; i++) {
            totalWeight += arr[i][1];
        }
        long cumulativeWieght = 0;
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            cumulativeWieght += arr[i][1];
            if (cumulativeWieght * 2 >= totalWeight) {
                n = i;
                break;
            }
        }
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != n) {
                int d = Math.abs(arr[i][0] - arr[n][0]);
                ans += (long) d * arr[i][1];
            }
        }
        return ans;
    }
}