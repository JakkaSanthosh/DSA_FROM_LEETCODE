class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> outer=new ArrayList<>();
        List<Integer> inner=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0||j==i) inner.add(1);
                else inner.add(outer.get(i-1).get(j-1)+outer.get(i-1).get(j));
            }
            outer.add(inner);
            inner=new ArrayList<>();
        }
        return outer;
    }
}