class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> al=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=-1) {
                k=0;
                al.add(0,nums[i]);}
            else{
                k++;
                res.add(((k<=al.size())?al.get(k-1):-1));
            }
        }
        return res;
    }
}