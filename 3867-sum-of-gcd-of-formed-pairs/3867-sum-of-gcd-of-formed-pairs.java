class Solution {
    public long gcdSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int[] prefix = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]){
                max = nums[i];
                
            }
            prefix[i] = gcd(nums[i], max);
        }
        Arrays.sort(prefix);
        int i = 0, j = prefix.length - 1;
        long sum = 0;
        while (i < j) {
            sum += gcd(prefix[i], prefix[j]);
            i++;
            j--;
        }
        return sum;
    }
    int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    } 
}