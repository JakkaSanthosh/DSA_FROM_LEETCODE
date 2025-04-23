class Solution {
    public int countLargestGroup(int n) {
       int c=0,max=0;
       Map<Integer,Integer> mp=new HashMap<>();
       for(int i=1;i<=n;i++){
        int x=i;
        int sum=0;
        while(x!=0){
            int r=x%10;
            sum+=r;
            x/=10;
        }
        mp.put(sum,1+mp.getOrDefault(sum,0));
        max=Math.max(max,mp.get(sum));
       } 
       for(int i:mp.keySet()){
        if(mp.get(i)==max) c++;
       }
       return c;
    }
}