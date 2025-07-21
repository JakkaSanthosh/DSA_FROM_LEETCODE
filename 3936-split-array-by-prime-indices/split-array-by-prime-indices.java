class Solution {
    public long splitArray(int[] nums) {
       long sum1=0,sum2=0; 
       boolean prime[]=new boolean[nums.length+1];
       Arrays.fill(prime,true);
       prime[0]=false;
       prime[1]=false;
       for(int i=2;i*i<=nums.length;i++){
       if(prime[i]){
        for(int j=i*i;j<=nums.length;j+=i) prime[j]=false;
       }
       }
       for(int i=0;i<nums.length;i++){
        if(prime[i]==false) sum1+=nums[i];
        else sum2+=nums[i];
       }
       return Math.abs(sum1-sum2);
    }
}