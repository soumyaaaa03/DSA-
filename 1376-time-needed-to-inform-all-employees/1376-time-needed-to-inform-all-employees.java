class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            if (manager[i] == -1) continue;
            adj.get(i).add(new int[]{manager[i], informTime[i]});
            adj.get(manager[i]).add(new int[]{i, informTime[manager[i]]});
        }
        return dfs(headID, new boolean[n], adj);
    }
    int dfs(int src, boolean[] vis, ArrayList<ArrayList<int[]>> adj) {
        vis[src] = true;
        int ans = 0;
        for (int[] nbr : adj.get(src)) {
            if (!vis[nbr[0]]) {
                ans = Math.max(
                    ans,
                    nbr[1] + dfs(nbr[0], vis, adj)
                );
            }
        }
        return ans;
    }
}