class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int lt = 0, gt = 0;
        for (int i = 0; i < k; i++)
            lt += nums[i];
        for (int i = nums.length - 1; i >= nums.length - k; i--)
            gt += nums[i];
        return gt - lt;
    }
}