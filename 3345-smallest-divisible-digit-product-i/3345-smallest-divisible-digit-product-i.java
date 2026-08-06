class Solution {
    public int smallestNumber(int n, int t) {
        while(true) {
            if (isValid(n, t)) {
                return n;
            }
            n++;
        }
    }
    boolean isValid(int n, int t) {
        int prod = 1;
        while (n != 0) {
            prod *= n %10;
            n = n / 10;
        }
        if (prod % t == 0) {
            return true;
        }
        return false;
    }
}