class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] dp = new Boolean[s.length() + 1];
        return helper(s, 0, wordDict, dp);   
    }
    boolean helper(String s, int i, List<String> dict, Boolean[] dp) {
        if (i == s.length()) {
            return true;
        }
        if (dp[i] != null) return dp[i];
        for (int end = i + 1; end <= s.length(); end++) {
            String w = s.substring(i, end);
            if (dict.contains(w)) {
                if (helper(s, end, dict, dp)) {
                    return dp[i] = true;
                }
            }
        }
        return dp[i] = false;
    }
}