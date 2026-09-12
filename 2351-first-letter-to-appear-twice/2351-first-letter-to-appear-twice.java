class Solution {
    public char repeatedCharacter(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray()) {
            if (freq[c - 'a'] > 0) {
                return c;
            }
            freq[c - 'a']++;
        }
        return s.charAt(0);
    }
}