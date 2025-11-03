class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> al = new HashSet<>();
        for (var i : nums)
            al.add(i);
        int max = Collections.max(al);
        int min = Collections.min(al);
        List<Integer> res = new ArrayList<>();
        for (int i = min+1; i < max; i++)
            if (!al.contains(i))
                res.add(i);
        return res;
    }
}