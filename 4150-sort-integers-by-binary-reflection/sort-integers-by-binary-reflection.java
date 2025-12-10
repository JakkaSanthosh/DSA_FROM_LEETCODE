class Solution {
    public int[] sortByReflection(int[] nums) {
        List<Integer> al = new ArrayList<>();
        for (int x : nums) {
            al.add(x);
        }
        Collections.sort(al, (a, b) -> {
            StringBuilder sb1 = new StringBuilder(Integer.toString(a, 2));
            StringBuilder sb2 = new StringBuilder(Integer.toString(b, 2));
            if (Integer.parseInt(sb1.reverse().toString(), 2) == Integer.parseInt(sb2.reverse().toString(), 2))
                return a - b;
            return Integer.parseInt(sb1.toString(), 2)-Integer.parseInt(sb2.toString(), 2);
        });
        for (int i = 0; i < nums.length; i++) {
            nums[i] = al.get(i);
        }
        return nums;
    }
}