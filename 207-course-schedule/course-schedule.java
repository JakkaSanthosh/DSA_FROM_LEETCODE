class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> mp = new HashMap<>();
        for (int i = 0; i < numCourses; i++)
            mp.put(i, new ArrayList<>());
        for (int i = 0; i < prerequisites.length; i++) {
            int u = prerequisites[i][1];
            int v = prerequisites[i][0];
            mp.get(u).add(v);
        }
        int vis[] = new int[numCourses];
        int pathVis[] = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (vis[i] == 0) {
                if (checkCycle(i, vis, pathVis, mp))
                    return false;
            }
        }
        return true;
    }
    static boolean checkCycle(int idx, int vis[], int pathVis[], Map<Integer, List<Integer>> mp) {
        vis[idx] = 1;
        pathVis[idx] = 1;
        for (var i : mp.get(idx)) {
            if (vis[i] == 0) {
                if (checkCycle(i, vis, pathVis, mp))
                    return true;
            } else if (pathVis[i] == 1)
                return true;
        }
        pathVis[idx] = 0;
        return false;
    }
}