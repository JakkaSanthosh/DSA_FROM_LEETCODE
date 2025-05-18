class Solution {
    public int[] distributeCandies(int candies, int n) {
        int a[]=new int[n];
        int k=1;
        while(candies>0){
            for(int i=0;i<n;i++){
                if(candies>=k)a[i]+=Math.abs(k);
                else a[i]+=candies;
                candies-=k;
                k++;
                if(candies<=0) break;
            }
        }
        return a;
    }
}