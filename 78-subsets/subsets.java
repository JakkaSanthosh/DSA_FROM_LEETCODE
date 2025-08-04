class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<(1<<n);i++){
            List<Integer> inner=new ArrayList<>();
            for(int j=0;j<n;j++){
                if(checkBit(i,j)){
                    inner.add(nums[j]);
                }
            }
            outer.add(inner);
        }
        return outer;
    }
    static boolean checkBit(int n,int i){
        return (n&(1<<i))!=0;
    }
}