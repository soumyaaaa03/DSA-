class Solution {
    public int firstUniqChar(String s) {
        int[][] freq = new int[26][2];
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            freq[c - 'a'][0]++;
            freq[c - 'a'][1] = i;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (freq[i][0] == 1) {
                ans = Math.min(ans, freq[i][1]);
            }
        }

        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }
}