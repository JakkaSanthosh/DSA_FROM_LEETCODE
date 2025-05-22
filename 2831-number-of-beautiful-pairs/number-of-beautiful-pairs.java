class Solution {
    public int countBeautifulPairs(int[] nums) {
       int cp=0;
       for(int i=0;i<nums.length-1;i++){
        String x=Integer.toString(nums[i]);
        for(int j=i+1;j<nums.length;j++){
             String y=Integer.toString(nums[j]);
             if(checkPrime(Integer.parseInt(x.substring(0,1)),Integer.parseInt(y.substring(y.length()-1)))) cp++;
        }
       }
       return cp;
    }
    static boolean checkPrime(int x,int y){
       int min=Math.min(x,y);
      int c=0;
       for(int i=1;i<=min;i++){
        if(x%i==0&&y%i==0) c++;
       }
       return c==1;
    }
}