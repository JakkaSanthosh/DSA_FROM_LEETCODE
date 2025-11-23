class Solution {
    public long sumAndMultiply(int n) {
        String s=n+"";
        String res="";
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='0') res+=ch;
            sum+=ch-'0';
        }

        return !res.equals("")?Long.parseLong(res)*sum:0;
    }
}