class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> outer=new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> hs=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<(1<<n);i++){
            List<Integer> inner=new ArrayList<>();
            for(int j=0;j<n;j++){
                if(checkBit(i,j)) inner.add(nums[j]);
            }
            hs.add(inner);
        }
        for(var i:hs) outer.add(i);
        return outer;
    }
    static boolean checkBit(int n,int i){
        return (n&(1<<i))!=0;
    }
}