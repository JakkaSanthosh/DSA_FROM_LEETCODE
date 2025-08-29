class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        Map<Integer, List<Integer>> mp = new HashMap<>();
        for (int i = 0; i < graph.length; i++)
            mp.put(i, new ArrayList<>());
        int indegree[] = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            for (var j : graph[i]) {
                mp.get(j).add(i);
                indegree[i]++;
            }
        }
        Queue<Integer> pq = new LinkedList<>();
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0)
                pq.add(i);
        }
        List<Integer> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            res.add(pq.peek());
            int node = pq.poll();
            for (var i : mp.get(node)) {
                indegree[i]--;
                if (indegree[i] == 0)
                    pq.offer(i);
            }
        }
        Collections.sort(res);
        return res;
    }
}