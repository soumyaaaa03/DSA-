class Solution {
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);
        if ((nums1[0] % 2) == 1) return true;
        for (int n : nums1) {
            if ((n % 2) != (nums1[0] % 2))
            return false;
        }
        return true;
    }
}