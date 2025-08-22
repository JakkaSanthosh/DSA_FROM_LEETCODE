public class Solution {
    public int LengthOfLastWord(string s) {
        s=s.Trim();
        string[] a=s.Split(' ', StringSplitOptions.RemoveEmptyEntries);
        return a[a.Length-1].Length;
    }
}