class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int cnt=0,n=nums.length;
        List<Integer> al=new ArrayList<>();
        for(int i=1;i<(1<<n);i++){
            int ans=0;
            for(int j=0;j<n;j++){
                if(checkBit(i,j)) ans|=nums[j];
            }
            al.add(ans);
        }
        Collections.sort(al);
        int max=al.get(al.size()-1);
        for(int i=al.size()-1;i>=0;i--){
            if(al.get(i)==max) cnt++;
            else break;
        }
        return cnt;
    }
    static boolean checkBit(int n,int i){
        return (n&(1<<i))!=0;
    }
}