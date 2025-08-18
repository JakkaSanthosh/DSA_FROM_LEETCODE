class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int rowMin[]=new int[m];
        int colMax[]=new int[n];
        for(int i=0;i<m;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                 min=Math.min(min,matrix[i][j]);
            }
            rowMin[i]=min;
        }
        for(int i=0;i<n;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<m;j++){
                max=Math.max(matrix[j][i],max);
            }
            colMax[i]=max;
        }
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(rowMin[i]==colMax[j]) al.add(matrix[i][j]);
            }
        }
        return al;
    }
}