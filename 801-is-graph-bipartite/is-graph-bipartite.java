class Solution {
    public boolean isBipartite(int[][] graph) {
        int color[] = new int[graph.length];
        Arrays.fill(color, -1);
        for (int i = 0; i < graph.length; i++) {
            if (color[i] == -1) {
                if (!bfs(i, color, graph))
                    return false;
            }
        }
        return true;
    }
    static boolean bfs(int idx, int color[], int graph[][]) {
        Queue<Integer> q = new LinkedList<>();
        color[idx] = 0;
        q.add(idx);
        while (!q.isEmpty()) {
            int curr = q.poll();
            for (var i : graph[curr]) {
                if (color[i] == -1) {
                    q.add(i);
                    color[i] = 1 - color[curr];
                } else if (color[i] == color[curr])
                    return false;
            }
        }
        return true;
    }
}