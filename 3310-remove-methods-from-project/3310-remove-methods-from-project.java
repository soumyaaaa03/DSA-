class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for(int[] arr : invocations) {
            adj.get(arr[0]).add(arr[1]);
        }
        
        boolean[] sus = new boolean[n];
        dfs(adj, k, sus);
        for (int[] arr : invocations) {
            int u = arr[0];
            int v = arr[1];
            if (!sus[u] && sus[v]) {
                List<Integer> ans = new ArrayList<>();
                for(int i = 0; i < n; i++) {
                    ans.add(i);
                }
                return ans;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!sus[i]){
                ans.add(i);
            }
        }
        return ans;
    }
    void dfs(ArrayList<ArrayList<Integer>> adj, int curr, boolean[] sus) {
        sus[curr] = true;
        for (int nbr : adj.get(curr)) {
            if (!sus[nbr])
            dfs(adj, nbr, sus);
        }
    }
}