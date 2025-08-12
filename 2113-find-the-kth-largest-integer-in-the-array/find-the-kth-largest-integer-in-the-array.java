class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        // int a[]=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     a[i]=Integer.parseInt(nums[i]);
        // }
        // Arrays.sort(a);
        // return a[nums.length-k]+"";
        Arrays.sort(nums, (a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            }
            return a.compareTo(b);
        });
        return nums[nums.length - k] + "";
    }
}