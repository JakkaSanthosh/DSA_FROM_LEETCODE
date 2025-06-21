class Solution {
    public boolean strongPasswordCheckerII(String s1) {
        int u=0,l=0,s=0,d=0;
        String spcl="!@#$%^&*()-+";
        for(int i=0;i<s1.length()-1;i++){
            char ch=s1.charAt(i);
            char ch1=s1.charAt(i+1);
            if(ch==ch1) return false;
            if(ch>='a'&&ch<='z') l++;
            else if(ch>='A'&&ch<='Z') u++;
            else if(ch>='0'&&ch<='9') d++;
            else if(spcl.contains(ch+"")) s++;
        }
        char ch=s1.charAt(s1.length()-1);
            if(ch>='a'&&ch<='z') l++;
            else if(ch>='A'&&ch<='Z') u++;
            if(ch>='0'&&ch<='9') d++;
            else if(spcl.contains(ch+"")) s++;;
        int sum=l+u+d+s;
        return u>0&&d>0&&s>0&&l>0&&sum>=8;
    }
}