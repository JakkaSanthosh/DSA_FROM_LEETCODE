class Solution {
    public int largestCombination(int[] candidates) {
       int max=0;
       for(int i=0;i<31;i++){
        int cnt=0;
        for(int j=0;j<candidates.length;j++){
            if(checkBit(candidates[j],i)) cnt++;
        }
        max=Math.max(max,cnt);
       }
        return max;
    }
    static boolean checkBit(int n,int i){
        return (n&(1<<i))!=0;
    }
}
