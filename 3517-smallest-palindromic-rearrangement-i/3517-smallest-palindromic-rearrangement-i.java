class Solution {
    public String smallestPalindrome(String s) {
        if (s.length() <= 1) return s;
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) continue;
            int f = freq[i];
            int cnt = f/2;
            while (cnt != 0) {
                sb.append((char) (i + 'a'));
                cnt--;
            }
        }
        String st = "";

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                st = String.valueOf((char)(i + 'a'));
                break;
            }
        }
        String st2 = new StringBuilder(sb).reverse().toString();
        String st1 = String.valueOf(sb);
        return st1 + st + st2;
    }
}