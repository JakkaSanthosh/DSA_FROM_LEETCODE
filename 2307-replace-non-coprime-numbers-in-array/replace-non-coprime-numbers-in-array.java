class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> al = new ArrayList<>();
        al.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            while (!al.isEmpty() && gcd(nums[i], al.get(al.size() - 1)) > 1) {
                nums[i] = lcm(nums[i], al.get(al.size() - 1));
                al.remove(al.size() - 1);
            }
            al.add(nums[i]);
        }
        return al;
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return (int) ((1L * a * b) / gcd(a, b));
    }
}