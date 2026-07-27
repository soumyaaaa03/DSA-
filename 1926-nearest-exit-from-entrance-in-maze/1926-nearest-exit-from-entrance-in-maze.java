class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        boolean[][] vis = new boolean[maze.length][maze[0].length];
        //int answer = Integer.MAX_VALUE;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {entrance[0], entrance[1], 0});
        vis[entrance[0]][entrance[1]] = true;
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int r = curr[0], c = curr[1], steps = curr[2];
            //vis[r][c] = true;
            int[][] dir = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
            for (int[] d : dir) {
                int nr = d[0] + r;
                int nc = d[1] + c;
                if (nr < 0 || nc < 0 || nr >= maze.length || nc >= maze[0].length || maze[nr][nc] == '+') continue;
                if (vis[nr][nc]) continue;
                if (nr == 0 || nr == maze.length - 1 || nc == 0 || nc == maze[0].length - 1) return steps + 1;
                
                vis[nr][nc] = true;
                q.add(new int[] {nr, nc, steps + 1});
            }
        }
        return -1;
    }
}