class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        int max = 0, l = 0, r = 0;
        while (r < s.length()) {
            char c = s.charAt(r);
            if (freq[c - 'a'] < 2) {
                freq[c - 'a']++;
                max = Math.max(max, r - l + 1);
                r++;
            } else {
                while (s.charAt(l) != s.charAt(r)) {
                    freq[s.charAt(l) - 'a']--;
                    l++;
                }
                freq[s.charAt(l) - 'a']--;
                l++;
            }
        }
        return max;
    }
}