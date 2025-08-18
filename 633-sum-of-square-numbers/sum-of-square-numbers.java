class Solution {
    public boolean judgeSquareSum(int c) {
       Set<Integer> hs=new HashSet<>();
       List<Integer> al=new ArrayList<>();
       for(long i=0;i*i<=c;i++){
        al.add((int)(i*i));
        hs.add(((int)(i*i)));
       }
       for(int i=0;i<al.size();i++){
          int tar=c-al.get(i);
          if(hs.contains(tar)) return true;
       }
       return false;
    }
}