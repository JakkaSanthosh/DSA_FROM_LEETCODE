class Solution {
    public int maximumLength(int[] nums) {
        int even=0,odd=0,evendp=0,odddp=0;
        for(var i:nums){
            if(i%2==0){
                even++;
                evendp=Math.max(evendp,odddp+1);
            }
            else{
                odd++;
                odddp=Math.max(odddp,evendp+1);
            }
        }
        return Math.max(Math.max(even,odd),Math.max(evendp,odddp));
   
    }
}