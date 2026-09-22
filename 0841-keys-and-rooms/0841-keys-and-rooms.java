class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis = new boolean[rooms.size()];
        bfs(0, vis, rooms);
        for (int i = 0; i < rooms.size(); i++) {
            if (!vis[i]) return false;
        }
        return true;
    }
    void dfs(int src, boolean[] vis, List<List<Integer>> adj) {
        vis[src] = true;
        for (int nbr : adj.get(src)) {
            if (!vis[nbr]) {
                dfs(nbr, vis, adj);
            }
        }
    }
    void bfs(int src, boolean[] vis, List<List<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while (!q.isEmpty()) {
            int curr = q.poll();
            vis[curr] = true;
            for (int nbr : adj.get(curr)) {
                if (!vis[nbr]) {
                    q.add(nbr);
                }
            }
        } 
    }
}