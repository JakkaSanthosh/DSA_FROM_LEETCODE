class Solution {
    public int totalMoney(int n) {
        
       if(n<=7) return (n*(n+1))/2;
    //    else if(n%7==0){
    //     int k=n/7;
    //     return 28*k+(7*(k));
    //    }
       else{
        int z=n;
            int m=z/7;
            int p=z%7;
            int o=m+1;
            int d=28*m+(7*((m*(m-1))/2));
            while(p!=0){
                d+=o;
                o++;
                p--;
            }
            return d;

        }
    // int x=n/7;
    // int y=n%7;
    // return ((int)(y*(y+1))/2)+(x*y)+(35*x)-7;
    }
}