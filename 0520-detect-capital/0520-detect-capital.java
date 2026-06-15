class Solution {
    public boolean detectCapitalUse(String word) {
        boolean first = false;
        char c = word.charAt(0);
        if (c >= 'A' && c <= 'Z') {
            return isUpper(word.substring(1)) || isLower(word.substring(1));
        } else {
            return isLower(word.substring(1));
        }
        //return false;
    }
    boolean isUpper(String str) {
        boolean ans = true;
        char[] arr = str.toCharArray();
        for (char c : arr) {
            if (c >= 'a' && c <= 'z') return false;
        }
        return ans;
    }
    boolean isLower(String str) {
        boolean ans = true;
        char[] arr = str.toCharArray();
        for (char c : arr) {
            if (c >= 'A' && c <= 'Z') return false;
        }
        return ans;
    }
}