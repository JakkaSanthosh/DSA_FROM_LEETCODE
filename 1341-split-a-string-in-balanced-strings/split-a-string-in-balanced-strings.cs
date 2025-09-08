public class Solution {
    public int BalancedStringSplit(string s) {
        int cnt=0,res=0;
        foreach(var i in s.ToCharArray()){
            if(i=='R') cnt++;
            else cnt--;
            if(cnt==0) res++;
        }
        return res;
    }
}