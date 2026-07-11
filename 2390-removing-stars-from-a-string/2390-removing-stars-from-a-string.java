class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (c == '*') {
                if (!st.isEmpty())
                st.pop();
                
                continue;
            }
            st.push(c);
            
            
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        sb.reverse();
        return String.valueOf(sb);
    }
}