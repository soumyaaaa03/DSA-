class Solution {
    public boolean checkDivisibility(int n) {
        int s = n;
        int sum = 0;
        int prod = 1;
        while (s > 0) {
            int rem = s % 10;
            prod *= rem;
            sum += rem;
            s = s/10;
        }
        return (n % (sum + prod) == 0);
    }
}