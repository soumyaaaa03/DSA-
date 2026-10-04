class Solution {
    public boolean checkValidString(String s) {
        int minopen = 0;
        int maxopen = 0;
        for (int i : s.toCharArray()) {
            if (i == '(') {
                minopen++;
                maxopen++;
            }
            else if (i == ')') {
                minopen--;
                maxopen--;
            }
            else {
                minopen--;
                maxopen++;
            }

            if (minopen < 0) minopen = 0;
            if (maxopen < 0) return false;
        }
        return minopen == 0;
    }
}