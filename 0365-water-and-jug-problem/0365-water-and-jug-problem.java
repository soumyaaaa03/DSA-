class Solution {
    HashSet<String> vis = new HashSet<>();
    public boolean canMeasureWater(int x, int y, int target) {
        return dfs(0, 0, x, y, target);
    }
    boolean dfs(int a, int b, int x, int y, int target) {
        if (a == target || b == target || a + b == target) {
            return true;
        }
        String s = a + "," + b;
        if (vis.contains(s)) return false;
        vis.add(s);
        if (dfs(x, b, x, y, target)) return true;
        if (dfs(a, y, x, y, target)) return true;
        if (dfs(0, b, x, y, target)) return true;
        if (dfs(a, 0, x, y, target)) return true;
        int pour = Math.min(a, y - b);
        if (dfs(a - pour, b + pour, x, y, target)) return true;
        pour = Math.min(x - a, b);
        if (dfs(a + pour, b - pour, x, y, target)) return true;
        return false;
    }
}