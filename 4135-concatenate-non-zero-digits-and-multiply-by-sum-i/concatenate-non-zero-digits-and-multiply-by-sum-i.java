class Solution {
    public long sumAndMultiply(int n) {
        int x=0;
        int sum=0;
        String s=n+"";
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i)-'0';
            if(ch!=0) x=x*10+ch;
            sum+=ch;
        }
        return (long)x*sum;
    }
}