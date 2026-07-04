class Solution {
    public int minScore(int n, int[][] roads) {
        int min = Integer.MAX_VALUE;
        boolean[] vis = new boolean[n + 1];
        Queue<Integer> q = new LinkedList<>();
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] r : roads) {
            adj.get(r[0]).add(new int[]{r[1], r[2]});
            adj.get(r[1]).add(new int[]{r[0], r[2]});
        }
        q.add(1);
        vis[1] = true;
        while(!q.isEmpty()) {
            int vtx = q.poll();
            for (int[] arr : adj.get(vtx)) {
                min = Math.min(min, arr[1]);
                if (!vis[arr[0]]) {
                    vis[arr[0]] = true;
                    q.add(arr[0]);
                }
            }
        }
        return min;
    }
}