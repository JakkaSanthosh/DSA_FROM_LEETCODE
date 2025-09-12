public class Solution {
    public bool DoesAliceWin(string s) {
        int cnt = 0;
        foreach(var i in s.ToCharArray()){
            if("aeiou".Contains(i+"")) return true;
        }
        return false;
    }
}