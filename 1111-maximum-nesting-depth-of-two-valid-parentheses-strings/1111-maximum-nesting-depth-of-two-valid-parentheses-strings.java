class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] ans = new int[seq.length()];
        int cnt = 0, i = 0;
        for (char c : seq.toCharArray()) {
            if (c == '(') {
                if (cnt % 2 == 0) {
                    ans[i++] = 1;
                } else 
                ans[i++] = 0;
                cnt++;
            } else if (c == ')') {
                --cnt;
                if (cnt % 2 == 0) {
                    ans[i++] = 1;
                } else 
                ans[i++] = 0;
            }
        }
        return ans;
    }
}