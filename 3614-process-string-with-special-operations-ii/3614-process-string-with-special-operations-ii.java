class Solution {
    public char processStr(String s, long k) {

        long len = 0;

        // Calculate final length
        for (char ch : s.toCharArray()) {

            if (ch >= 'a' && ch <= 'z') {
                len++;
            }
            else if (ch == '*') {
                if (len > 0) len--;
            }
            else if (ch == '#') {
                len *= 2;
            }
            else if (ch == '%') {
                // length unchanged
            }

            if (len > k) {
                // enough information for kth char
            }
        }

        if (k >= len) return '.';

        // Traverse backwards
        for (int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                len--;

                if (k == len) {
                    return ch;
                }
            }

            else if (ch == '#') {

                len /= 2;
                k %= len;
            }

            else if (ch == '%') {

                k = len - 1 - k;
            }

            else if (ch == '*') {

                len++;
            }
        }

        return '.';
    }
}