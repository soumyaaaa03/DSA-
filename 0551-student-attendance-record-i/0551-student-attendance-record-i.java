class Solution {
    public boolean checkRecord(String s) {
        int lc = 0, ac = 0;
        for (char c : s.toCharArray()) {
            if (c == 'A') {
                ac++;
                if (ac >= 2) return false;
                lc = 0;
            } else if (c == 'L') {
                lc++;
                if (lc >= 3) return false;
            } else {
                lc = 0;
            }
        }
        return true;
    }
}