class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for (String str : words) {
            int wt = weight(str, weights);
            char ch = (char) ('z' - wt);
            sb.append(ch);
        }
        return sb.toString();
    }
    int weight(String str, int[] arr) {
        int ans = 0;
        char[] ch = str.toCharArray();
        for (char c : ch) {
            ans += arr[c - 'a'];
        }
        return ans % 26;
    }
}