class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m = grid.size();
        int n = grid.get(0).size();
        Queue<int[]> q = new LinkedList<>();
        int[][] best = new int[m][n];
        for (int[] roe : best) {
            Arrays.fill(roe, -1);
        }
        if (grid.get(0).get(0) == 1){
            health--;
        }
        if (health <= 0) return false;
        best[0][0] = health;
        q.add(new int[]{0, 0, health});
        int[][] dr = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            int h = curr[2];
            if (r == m -1 && c == n - 1) 
            return true;
            for (int[] d : dr) {
                int nr = r + d[0];
                int nc = c + d[1];
                if (nr > m - 1 || nc > n - 1 || nr < 0 || nc < 0) continue;
                int nh = h;
                if (grid.get(nr).get(nc) == 1) nh--;
                if (nh <= 0) continue;
                if (best[nr][nc] >= nh) continue;
                best[nr][nc] = nh;
                q.add(new int[]{nr, nc, nh});
            }
        }
        return false;
    }
    boolean dfs(int r, int c, List<List<Integer>> grid, int h) {
        if (r < 0 || c < 0 || r >= grid.size() || c >= grid.get(0).size() || grid.get(r).get(c) == -1) return false;
        
        if (grid.get(r).get(c) == 1) {
            h--;
            if (h <= 0) return false;
        }
        if (r == (grid.size() - 1) && c == (grid.get(0).size() - 1)) return true;
        int n = grid.get(r).get(c);
        grid.get(r).set(c, -1);
        boolean b = dfs(r -1, c, grid, h) || dfs(r + 1, c, grid, h) || dfs(r, c + 1, grid, h) || dfs(r, c - 1, grid, h);
        grid.get(r).set(c, n);
        return b;
    }
}