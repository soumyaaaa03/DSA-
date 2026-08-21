class Solution {
    public int minMoves(int target, int maxDoubles) {
        if (target == 1) return 0;
        int ans = 0;
        while (target > 1) {
            if (maxDoubles == 0) {
                return ans + target - 1;
            }
            if (target % 2 == 0 && maxDoubles > 0) {
                target = target/2;
                ans++;
                maxDoubles--;
            } else {
                target -= 1;
                ans++;
            }
        }
        return ans;

        // Queue<int[]> q = new LinkedList<>();
        // q.add(new int[]{1, 0, maxDoubles});
        // while (!q.isEmpty()) {
        //     int[] temp = q.poll();
        //     if (temp[0] == target) return temp[1];
        //     if (temp[2] > 0 && temp[0] * 2 <= target)
        //     q.add(new int[]{temp[0] * 2, temp[1] + 1, temp[2] - 1});
        //     if (temp[0] + 1 <= target)
        //     q.add(new int[]{temp[0] + 1, temp[1] + 1, temp[2]});
        // }
        // return -1;


        // int[][] dp = new int[target + 1][maxDoubles + 1];
        // for (int[] d : dp) {
        //     Arrays.fill(d, -1);
        // }
        // return helper(target, 1, maxDoubles, dp);
    }

    int helper(int target, int n, int maxDoubles, int[][] dp) {
        if (n == target) {
            return 0;
        }
        if (n > target) {
            return Integer.MAX_VALUE;
        }
        if (dp[n][maxDoubles] != -1) return dp[n][maxDoubles];
        int add = helper(target, n + 1, maxDoubles, dp);
        if (add != Integer.MAX_VALUE) add++;
        int doub = Integer.MAX_VALUE;
        if (maxDoubles > 0) {
            doub = helper(target, n * 2, maxDoubles - 1, dp);
            if (doub != Integer.MAX_VALUE) doub++;
        }
        return dp[n][maxDoubles] = Math.min(add, doub);
    }
}