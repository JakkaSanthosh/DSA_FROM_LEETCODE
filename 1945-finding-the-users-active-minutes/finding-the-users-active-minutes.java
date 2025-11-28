class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, Set<Integer>> mp = new HashMap<>();
        int res[] = new int[k];
        for (int i[] : logs) {
            if (!mp.containsKey(i[0])) {
                mp.put(i[0], new HashSet<>());
            }
            mp.get(i[0]).add(i[1]);
        }
        for (var i : mp.keySet()) {
            int uam = mp.get(i).size();
            res[uam - 1]++;
        }
        return res;
    }
}