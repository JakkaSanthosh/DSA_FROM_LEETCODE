class Solution {
    public boolean judgeSquareSum(int c) {
       List<Integer> al=new ArrayList<>();
       for(long i=0;i*i<=c;i++){
        al.add((int)(i*i));
       }
       for(int i=0;i<al.size();i++){
          int tar=c-al.get(i);
          int low=i,high=al.size()-1;
          while(low<=high){
            int mid=low+(high-low)/2;
            if(al.get(mid)==tar) return true;
            else if(al.get(mid)>tar) high=mid-1;
            else low=mid+1;
          }
       }
       return false;
    }
}