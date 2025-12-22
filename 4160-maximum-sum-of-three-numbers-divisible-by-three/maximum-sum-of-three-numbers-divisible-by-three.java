class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer, List<Integer>> mp = new HashMap<>();
        for (var i : nums) {
            int rem = i % 3;
            if (!mp.containsKey(rem))
                mp.put(rem, new ArrayList<>());
            mp.get(rem).add(i);
        }
        int max = 0, i = 0;
        while (i < 3 ) {
            if(mp.containsKey(i) && mp.get(i).size() >= 3){
            Collections.sort(mp.get(i));
            int n = mp.get(i).size();
            int sum = mp.get(i).get(n - 1) + mp.get(i).get(n - 2) + mp.get(i).get(n - 3);
            if (sum > max)
                max = sum;
            }
            i++;
        }
        if (mp.containsKey(0) && mp.containsKey(1) && mp.containsKey(2)) {
            int zs = mp.get(0).size();
            int os = mp.get(1).size();
            int ts = mp.get(2).size();
            Collections.sort(mp.get(0));
            Collections.sort(mp.get(1));
            Collections.sort(mp.get(2));
            int sum = mp.get(0).get(zs - 1) + mp.get(1).get(os - 1) + mp.get(2).get(ts - 1);
            if (sum > max)
                max = sum;
        }
        return max;
    }
}