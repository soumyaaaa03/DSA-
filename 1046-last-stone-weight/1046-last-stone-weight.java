class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int n : stones) {
            q.add(n);
        }
        while (q.size() > 1) {
            int a = q.poll();
            int b = q.poll();
            int d = Math.abs(a - b);
            if (d != 0) {
                q.add(d);
            }
        }
        return q.isEmpty() ? 0 : q.poll();
    }
}