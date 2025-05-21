class Solution {
    public boolean isFascinating(int n) {
       Set<Integer> hs=new HashSet<>();
       int n2=2*n,n3=3*n;
       while(n!=0){
        int r=n%10;
        if(r==0||!hs.add(r)) return false;
        n/=10;
       } 
       while(n2!=0){
        int r=n2%10;
        if(r==0||!hs.add(r)) return false;
        n2/=10;
       } 
       while(n3!=0){
        int r=n3%10;
        if(r==0||!hs.add(r)) return false;
        n3/=10;
       }
       return hs.size()==9; 
    }
}