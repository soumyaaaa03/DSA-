class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        int[][] arr = new int[freq.size()][2];

        int i = 0;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {

            arr[i][0] = entry.getKey();

            arr[i][1] = entry.getValue();

            i++;
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(b[1], a[1]));
        int[] ans = new int[k];
        i = 0;
        while (i < k) {
            ans[i] = arr[i][0];
            i++;
        }
        return ans;
    }
}