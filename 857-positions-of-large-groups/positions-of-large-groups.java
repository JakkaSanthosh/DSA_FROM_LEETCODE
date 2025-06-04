class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> outer=new ArrayList<>();
        int c=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)) c++;
            else{
                if(c>=3){
                    List<Integer> inner=new ArrayList<>();
                    inner.add(i-c);
                    inner.add(i-1);
                    outer.add(inner);
                }
                c=1;
            }
        }
        if(c>=3&&s.charAt(s.length()-1)==s.charAt(s.length()-2)){
              List<Integer> inner=new ArrayList<>();
                    inner.add(s.length()-c);
                    inner.add(s.length()-1);
                    outer.add(inner);
        }
        return outer;
    }
}