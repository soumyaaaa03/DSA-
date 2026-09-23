class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] arr : redEdges) {
            adj.get(arr[0]).add(new int[]{arr[1], 1});
        }
        for (int[] arr : blueEdges) {
            adj.get(arr[0]).add(new int[]{arr[1], 2});
        }
        int[] ans = new int[n];
        boolean[][] vis = new boolean[n][3];
        Arrays.fill(ans, Integer.MAX_VALUE);
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0, 0});
        vis[0][0] = true;
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            ans[curr[0]] = Math.min(curr[1], ans[curr[0]]);
            
            for (int[] nbr : adj.get(curr[0])) {
                if (!vis[nbr[0]][nbr[1]] && nbr[1]!=curr[2]) {
                    vis[nbr[0]][nbr[1]] = true;
                    q.add(new int[]{nbr[0], curr[1] + 1, nbr[1]});
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (ans[i] == Integer.MAX_VALUE) {
                ans[i] = -1;
            }
        }
        return ans;
    }
}