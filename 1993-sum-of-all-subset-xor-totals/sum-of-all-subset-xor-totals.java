class Solution {
    public int subsetXORSum(int[] nums) {
        int sum=0,n=nums.length;
        for(int i=1;i<(1<<n);i++){
            int xor=0;
            for(int j=0;j<n;j++){
                if(checkBit(i,j)) xor^=nums[j];
            }
            sum+=xor;
        }
        return sum;
    }
    static boolean checkBit(int n,int i){
        return (n&(1<<i))>0;
    }
}