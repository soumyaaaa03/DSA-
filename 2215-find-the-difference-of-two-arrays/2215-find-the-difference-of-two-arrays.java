class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }
        for (int n : nums2) {
            set2.add(n);
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int n : set1) {
            if (!set2.contains(n)) list1.add(n);
        }
        for (int n : set2) {
            if (!set1.contains(n)) list2.add(n);
        }
        ans.add(list1);
        ans.add(list2);
        return ans;
        // HashSet<Integer> set = new HashSet<>();

        // for (int num : nums2) {
        //     set.add(num);
        // }
        // List<List<Integer>> ans = new ArrayList<>();
        // List<Integer> lis1 = new ArrayList<>();
        // for (int n : nums1) {

        //     if (!set.contains(n)) {
        //         if (!lis1.contains(n))
        //         lis1.add(n);
        //     }
        // } 
        // ans.add(lis1);
        // set.clear();
        // for (int num : nums1) {
            
        //     set.add(num);
        // }
        // List<Integer> lis2 = new ArrayList<>();
        // for (int n : nums2) {

        //     if (!set.contains(n)) {
                
        //         lis2.add(n);
        //     }
        // } 
        // ans.add(lis2);
        // return ans;
    }
}