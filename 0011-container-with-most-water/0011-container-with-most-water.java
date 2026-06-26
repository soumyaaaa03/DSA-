class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int i = 0, j = height.length - 1;
        while (i < j) {
            int a = Math.min(height[i], height[j]);
            int b = j - i;
            max = Math.max(max, a*b);
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return max;
        
        
        /*int max = Integer.MIN_VALUE;
        for (int i = 0; i < height.length; i++) {
            for (int j = i; j < height.length; j++) {
                int a = Math.min(height[i], height[j]);
                int b = j - i;
                max = Math.max(max, a*b);
            }
        }
        return max;*/
    }
}