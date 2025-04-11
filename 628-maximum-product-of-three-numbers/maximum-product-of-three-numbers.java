class Solution {
    public int maximumProduct(int[] nums) {
     Arrays.sort(nums);
     int x= nums[0]*nums[1]*nums[nums.length-1];
     return Math.max(x,nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);   
    }
}