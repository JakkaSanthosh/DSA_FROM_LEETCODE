class Solution {
    public int[][] merge(int[][] interval) {
        List<Integer> inner=new ArrayList<>();
        List<List<Integer>> outer=new ArrayList<>();
        Arrays.sort(interval, (a, b) -> Integer.compare(a[0], b[0]));
        inner.add(interval[0][0]);
        int max=interval[0][1];
        for(int i=1;i<interval.length;i++){ 
           
                if(interval[i][0]>max) {inner.add(max);
                outer.add(inner);
                inner=new ArrayList<>();
                inner.add(interval[i][0]);
                max=interval[i][1];}
                max=Math.max(max,interval[i][1]);
            
        }
        inner.add(max);
        outer.add(inner);
        int a[][]=new int[outer.size()][2];
        System.out.println(outer);
        for(int i=0;i<outer.size();i++){
            a[i][0]=outer.get(i).get(0);
            a[i][1]=outer.get(i).get(1);
        }
        return a;
    }
}