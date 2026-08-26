class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int i = 0, j = 0;
        String ans = "";
        while (j < s.length()) {
            if (s.charAt(j) == '1') {
                k--;
            }
            while (k == 0 && i <= j) {
                if (ans.equals("")) {
                    ans = s.substring(i, j + 1);
                }
                String temp = s.substring(i, j + 1);
                if (temp.length() < ans.length()) {
                    ans = temp;
                } else if (temp.length() == ans.length()) {
                    if (temp.compareTo(ans) < 0) {
                        ans = temp;
                    }
                } 
                if (s.charAt(i)  == '1') {
                    k++;
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}