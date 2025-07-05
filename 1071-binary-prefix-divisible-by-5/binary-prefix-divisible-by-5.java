class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
       List<Boolean> al=new ArrayList<>();
       int num=0;
       for(var i:nums){
         num=((num<<1)+i)%5;
         al.add(num==0);
       } 
       return al;
    }
}