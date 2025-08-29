class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> mp = new HashMap<>();
        for (int i = 0; i < numCourses; i++)
            mp.put(i, new ArrayList<>());
        int indegree[] = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            int u = prerequisites[i][1];
            int v = prerequisites[i][0];
            mp.get(u).add(v);
            indegree[v]++;
        }
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0)
                q.offer(i);
        }
        int res[] = new int[numCourses], idx = 0;
        while (!q.isEmpty()) {
            res[idx++] = q.peek();
            int node = q.poll();
            for (var i : mp.get(node)) {
                indegree[i]--;
                if (indegree[i] == 0)
                    q.offer(i);
            }
        }
        return (idx == numCourses) ? res : new int[] {};
    }
}