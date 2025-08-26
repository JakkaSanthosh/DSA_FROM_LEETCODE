class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea = 0;
        double diag = 0;
        for (int i = 0; i < dimensions.length; i++) {
            int len = dimensions[i][0];
            int wid = dimensions[i][1];
            if (Math.sqrt(len * len + wid * wid) > diag) {
                maxArea =  len * wid ;
                diag =Math.sqrt(len * len + wid * wid);
            }
            else if(Math.sqrt(len * len + wid * wid)==diag) maxArea=Math.max(maxArea,len*wid);
        }
        return maxArea;
    }
}