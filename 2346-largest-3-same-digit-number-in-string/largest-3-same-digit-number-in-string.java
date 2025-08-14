class Solution {
    public String largestGoodInteger(String nums) {
        String x="";
        for(int i=0;i<nums.length()-2;i++){
            String k="";
            if((nums.charAt(i)==nums.charAt(i+1))&&(nums.charAt(i)==nums.charAt(i+2))){
              k+=nums.charAt(i);
              if(k.compareTo(x)>0) x=k;
            }
        }
        return x.repeat(3);
    }
}