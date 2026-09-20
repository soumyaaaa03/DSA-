class Solution {
    public int reverseDegree(String s) {
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            n += ((i + 1) * (26 - (c - 'a')));
        }
        return n;
    }
}