class Solution {
    public String triangleType(int[] nums) {
        String x="none";
        if(nums[0]+nums[1]>nums[2]&&nums[1]+nums[2]>nums[0]&&nums[0]+nums[2]>nums[1]){
            Set<Integer> hs=new HashSet<>();
            for(var i:nums) hs.add(i);
            if(hs.size()==1) x="equilateral";
            else if(hs.size()==3) x="scalene";
            else x="isosceles";
        }
        return x;
    }
}