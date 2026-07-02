class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : words) {
            char[] ch = s.toCharArray();
            int n = 0;
            StringBuilder sb = new StringBuilder();
            for (char c : ch) {
                if (c == 'Q' || c == 'q' || c == 'W' || c == 'w' || c == 'E' || c == 'e' || c == 'R' || c == 'r' || c == 'T' || c == 't' || c == 'Y' || c == 'y' || c == 'U' || c == 'u' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'P' || c == 'p') {
                    if (n == 0 || n == 1) {
                        n = 1;
                    } else {
                        break;
                    }
                } else if (c == 'A' || c == 'a' || c == 'S' || c == 's' || c == 'D' || c == 'd' || c == 'F' || c == 'f' || c == 'G' || c == 'g' || c == 'H' || c == 'h' || c == 'J' || c == 'j' || c == 'K' || c == 'k' || c == 'L' || c == 'l') {
                    if (n == 0 || n == 2) {
                        n = 2;
                    } else {
                        break;
                    }
                } else {
                    if (n == 0 || n == 3) {
                        n = 3;
                    } else {
                        break;
                    }
                }
                sb.append(c);
            }
            if (sb.toString().equals(s)) list.add(s);
        }
        return list.toArray(new String[0]);
    }
}