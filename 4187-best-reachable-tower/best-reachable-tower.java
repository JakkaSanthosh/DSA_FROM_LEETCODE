class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int maxQuality=-1;
        int x=-1,y=-1;
        for(int i=0;i<towers.length;i++){
            int m=towers[i][0];
            int n=towers[i][1];
            int gap=Math.abs(center[0]-m)+Math.abs(center[1]-n);
            if(gap<=radius&&towers[i][2]>=maxQuality){
                if(towers[i][2]>maxQuality){
                    x=m;
                    y=n;
                    maxQuality=towers[i][2];
                }
                else if(towers[i][2]==maxQuality){
                    if(m<x||(m==x&&n<y)){
                        x=m;
                        y=n;
                    }
                }
            }
        }
        return new int[]{x,y};
    }
}