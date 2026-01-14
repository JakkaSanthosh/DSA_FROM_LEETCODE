class Solution {
    public int centeredSubarrays(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
         Set<Integer> hs=new HashSet<>();
            int sum=nums[i];
            cnt++;
            hs.add(nums[i]);
            for(int j=i+1;j<nums.length;j++){
            hs.add(nums[j]);
                sum+=nums[j];
                if(hs.contains(sum)) cnt++;
            }
        }
        return cnt;
    }
}