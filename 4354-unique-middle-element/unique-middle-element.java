class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int arr[]=new int[100];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]-1]+=1;
        }
        return arr[nums[nums.length/2]-1]==1;
    }
}