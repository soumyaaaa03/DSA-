class Solution {

    public boolean hasValidPath(char[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        // Basic impossible cases
        if (grid[0][0] == ')')
            return false;

        if (grid[m - 1][n - 1] == '(')
            return false;

        // Path contains m + n - 1 characters.
        // Valid parentheses string must have even length.
        if ((m + n - 1) % 2 != 0)
            return false;

        Boolean[][][] dp = new Boolean[m][n][m + n];

        return helper(grid, 0, 0, 0, dp);
    }

    boolean helper(char[][] arr, int cnt, int i, int j,
                   Boolean[][][] dp) {

        // Out of bounds
        if (i >= arr.length || j >= arr[0].length)
            return false;

        // Process current character
        if (arr[i][j] == '(') {
            cnt++;
        } else {
            cnt--;
        }

        // Invalid prefix
        if (cnt < 0)
            return false;

        // Destination
        if (i == arr.length - 1 &&
            j == arr[0].length - 1) {

            return cnt == 0;
        }

        // Already calculated
        if (dp[i][j][cnt] != null)
            return dp[i][j][cnt];

        boolean down =
            helper(arr, cnt, i + 1, j, dp);

        boolean right =
            helper(arr, cnt, i, j + 1, dp);

        return dp[i][j][cnt] = down || right;
    }
}