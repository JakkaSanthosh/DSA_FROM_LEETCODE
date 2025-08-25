class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Map<Integer, List<Integer>> mp = new HashMap<>();
        int total = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.get(i).size(); j++) {
                int diag = i + j;
                if (!mp.containsKey(diag)) {
                    mp.put(diag, new ArrayList<>());
                }
                mp.get(diag).add(nums.get(i).get(j));
                total++;
            }
        }
        int res[] = new int[total], idx = 0;
        for (int i = 0; i < mp.size(); i++) {
            List<Integer> diag = mp.get(i);
            Collections.reverse(diag);
            for (var j : diag)
                res[idx++] = j;
        }
        return res;
    }
}