class Solution {
    public int countEven(int num) {
        int c=0;
        for(int i=2;i<=num;i++){
            if(isEven(i)) c++;
        }
        return c;
    }
    static boolean isEven(int k){
        int sum=0;
        while(k!=0){
            int r=k%10;
            sum+=r;
            k/=10;
        }
            return sum%2==0;
    }
}