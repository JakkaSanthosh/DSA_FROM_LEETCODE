public class Solution {
    public int MinOperations(string s) {
       int[] a=new int[26];
       foreach(var i in s.ToCharArray()){
        int idx=i-'a';
        a[idx]=1;
       } 
       for(int i=1;i<26;i++){
        if(a[i]==1) return 26-i;
       }
       return 0;
    }
}