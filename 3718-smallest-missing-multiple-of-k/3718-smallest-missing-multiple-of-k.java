class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<>();
        for (int n : nums) {
            hs.add(n);
        }
        int i = 1;
        while (true) {
            int an = k * i++;
            if (!hs.contains(an))
            return an;
        }
    }
}