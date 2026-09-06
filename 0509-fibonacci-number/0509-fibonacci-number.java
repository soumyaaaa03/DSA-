class Solution {
    public int fib(int n) {
        // int n1 = 0, n2 = 1;
        // if (n == 0) return 0;
        // if (n == 1) return 1;
        // int i = 2;
        // while (i <= n) {
        //     int temp = n2;
        //     n2 = n1 + n2;
        //     n1 = temp;
        //     i++;
        // }
        // return n2;
        return helper(n);
    }

    int helper(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return helper(n - 1) + helper(n - 2);
    }
}