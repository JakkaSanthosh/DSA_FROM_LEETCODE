class Solution {
    public int distinctAverages(int[] nums) {
        Set<Double> hs=new HashSet<>();
        Arrays.sort(nums);
        int low=0,high=nums.length-1;
        while(low<high){
            hs.add((nums[low]+nums[high])/2.0);
            low++;high--;
        }
        return hs.size();
    }
}