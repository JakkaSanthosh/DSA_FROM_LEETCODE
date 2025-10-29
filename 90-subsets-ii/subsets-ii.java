class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> outer=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<(1<<n);i++){
            List<Integer> inner=new ArrayList<>();
            for(int j=0;j<n;j++){
                if(checkBit(i,j)) inner.add(nums[j]);
            }
            if(!outer.contains(inner)) outer.add(inner);
        }
        return outer;
    }
    static boolean checkBit(int n,int i){
        return (n&(1<<i))!=0;
    }
}