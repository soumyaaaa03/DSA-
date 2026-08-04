class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i : nums) {
            smallest = Math.min(smallest, i);
            largest = Math.max(largest, i);
        }
        if (nums.length == largest - smallest + 1) return new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for (int n : nums) {
            hs.add(n);
        }
        
        List<Integer> lis = new ArrayList<>();
        for (int i = smallest; i <= largest; i++) {
            if (!hs.contains(i))
            lis.add(i);
        }
        return lis;
    }
}