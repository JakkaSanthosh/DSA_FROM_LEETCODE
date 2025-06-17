class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            Set<Integer> hs1=new HashSet<>();
            Set<Integer> hs2=new HashSet<>();
            for(int j=0;j<n;j++){
                if(!hs1.add(matrix[i][j])) return false;
                if(!hs2.add(matrix[j][i])) return false;
            } 
        }
        return true;
    }
}