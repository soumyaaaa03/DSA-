class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        while (max != 0) {
            int temp = max;
            max = min % max;
            min = temp;
        }
        return min;
    }
}