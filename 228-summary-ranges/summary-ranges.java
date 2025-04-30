class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> al=new ArrayList<>();
        if(nums.length==0) return al;
        int c=0,k=999999999;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]!=nums[i]+1){
                if(k==999999999) al.add(nums[i]+"");
                else al.add(nums[k]+"->"+nums[i]+"");
                k=999999999;
            }
            else {
                if(i<k) k=i;
            }
        }
if(k!=999999999) al.add(nums[k]+"->"+nums[nums.length-1]+"");
else al.add(nums[nums.length-1]+"");
    return al;
    }
}