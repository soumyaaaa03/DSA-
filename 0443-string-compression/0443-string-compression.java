class Solution {
    public int compress(char[] chars) {
        int read = 0; 
        int write = 0;
        
        while (read < chars.length) {
            char curr = chars[read];
            int cnt = 0;
            while (read < chars.length && chars[read] == curr) {
                cnt++;
                read++;
            }
            chars[write++] = curr;
            if (cnt > 1) {
                String s = String.valueOf(cnt);
                
                for (char c : s.toCharArray()) {
                    chars[write++] = c;
                    
                }
            }
        }
        return write;
    }
}