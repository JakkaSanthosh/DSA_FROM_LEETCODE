class Solution {
    public int totalWaviness(int num1, int num2) {
        int total=0;
        while(num1<=num2){
            if(num1>=100){
                total+=wave(num1+"");
            }
            num1++;
        }
        return total;
    }
    static int wave(String s){
        int n=s.length();
        int i=1,res=0;
        while(i<n-1){
            int prev=s.charAt(i-1)-'0';
            int curr=s.charAt(i)-'0';
            int next=s.charAt(i+1)-'0';
            if((curr>prev&&curr>next)||(curr<prev&&curr<next)) res++;
            i++;
        }
        return res;
    }
}