class Solution {
    public int punishmentNumber(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            String k=Integer.toString(i*i);
           if(punish(k,i)){
                sum+=i*i;
            }
        }
        return sum;
    }
    static boolean punish(String s,int tar){
     if(s.equals("")&&tar==0) return true;
     if(tar<0) return false;
    
     for(int i=0;i<s.length();i++){
      String left=s.substring(0,i+1);
      String right=s.substring(i+1);
      int leftnum=Integer.parseInt(left);
      if(punish(right,tar-leftnum)){
       return true;
      }
     }
      return false;
    }
}