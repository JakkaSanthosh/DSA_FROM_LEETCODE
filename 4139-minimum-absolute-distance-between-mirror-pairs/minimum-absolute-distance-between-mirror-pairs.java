class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        int res=nums.length;
        for(int i=nums.length-1;i>=0;i--){
            int rev=reverse(nums[i]);
            if(mp.containsKey(rev)) res=Math.min(res,mp.get(rev)-i);
             mp.put(nums[i],i);
        }
        return res==nums.length?-1:res;
    }
    static int reverse(int n){
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev;
    }
}