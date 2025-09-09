class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> al = new ArrayList<>();
        for (var i : nums) {
            int idx = Collections.binarySearch(al, i);
            if (idx < 0)
                idx = -idx - 1;
            if (idx == al.size())
                al.add(i);
            else
                al.set(idx, i);
        }
        return al.size();
    }
}