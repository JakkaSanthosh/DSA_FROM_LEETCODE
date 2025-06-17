class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        // int sum=0;
        // for(int i=1;i<=n;i++) sum+=i;
        for(int i=0;i<n;i++){
            int sum1=0,sum2=0;
            Set<Integer> hs1=new HashSet<>();
            Set<Integer> hs2=new HashSet<>();
            for(int j=0;j<n;j++){
                if(!hs1.add(matrix[i][j])) return false;
                if(!hs2.add(matrix[j][i])) return false;
                // sum1+=matrix[i][j];
                // sum2+=matrix[j][i];
            }
            //if(sum1!=sum&&sum2!=sum) return false;
        }
        return true;
    }
}