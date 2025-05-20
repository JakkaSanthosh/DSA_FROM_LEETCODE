class Solution {
    public int countBalls(int low, int high) {
        Map<Integer,Integer> mp=new HashMap<>();
        int max=0;
        while(low<=high){
            if(low==high){
            insert(mp,low);
            low++;}
            else{
            insert(mp,low);
            insert(mp,high);
            low++;
            high--;}
        }
        for(var i:mp.values()){
            if(i>max) max=i;
        }
        return max;
    }
    static void insert(Map<Integer,Integer> mp,int num){
        int sum=0;
        while(num!=0){
            int r=num%10;
             sum+=r;
             num/=10;
        }
        mp.put(sum,mp.getOrDefault(sum,0)+1);
    }
}