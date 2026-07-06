class Solution {
    public int maxVowels(String s, int k) {
        int max = Integer.MIN_VALUE;
        int cnt = 0;
        for (int i = 0; i < k; i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cnt++;
            }
        }
        max = cnt;
        int i = 0, j = k;
        while (j < s.length()) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cnt--;
            }
            c = s.charAt(j);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cnt++;
            }
            max = Math.max(cnt, max);
            j++;
            i++;
        }
        return max;
    }
}