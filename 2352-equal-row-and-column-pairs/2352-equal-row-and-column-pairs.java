class Solution {
    public int equalPairs(int[][] grid) {
        int ans = 0;
        HashMap<String, Integer> map = new HashMap<>();
        //HashMap<int[], Integer> mapc = new HashMap<>();
        //HashSet<String> set = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            map.put(Arrays.toString(grid[i]), map.getOrDefault(Arrays.toString(grid[i]), 0) + 1);
        }
        for (int j = 0; j < grid.length; j++) {
            int[] arr = new int[grid.length];
            for (int i = 0; i < grid.length; i++) {
                arr[i] = grid[i][j];
            }
            ans += map.getOrDefault(Arrays.toString(arr), 0);
        }
        return ans;
    }
}