class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;
        char[] f1 = new char[26];
        char[] f2 = new char[26];
        for (char c : word1.toCharArray()) {
            f1[c - 97]++;
        }
        for (char c : word2.toCharArray()) {
            f2[c - 97]++;
        }
        for (int i = 0; i < 26; i++) {
            if ((f1[i] == 0) != (f2[i] == 0))
                return false;
        }

        // Sort frequency arrays
        Arrays.sort(f1);
        Arrays.sort(f2);

        // Compare frequencies
        return Arrays.equals(f1, f2);
    }
}