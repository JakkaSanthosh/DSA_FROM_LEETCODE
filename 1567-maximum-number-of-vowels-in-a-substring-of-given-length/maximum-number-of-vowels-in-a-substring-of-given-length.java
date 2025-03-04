class Solution {
    public int maxVowels(String s, int k) {
        int c=0,ans=0;
        for(int i=0;i<k;i++){
  char d=s.charAt(i);
  if("aeiouAEIOU".contains(d+"")) c++;
        }
        ans=Math.max(ans,c);
        for(int i=1;i<=s.length()-k;i++){
            char x=s.charAt(i+k-1);
            char y=s.charAt(i-1);
            if("aeiouAEIOU".contains(x+"")) c++;
            if("aeiouAEIOU".contains(y+"")) c--;
            ans=Math.max(ans,c);
        }
        return  ans;
    }
}