class Solution {
    public String[] createGrid(int m, int n) {
        String res[]=new String[m];
        for(int i=0;i<m;i++){
            String t="";
            if(i<m-1) t=t+'.'+"#".repeat(n-1);
            else t=t+".".repeat(n);
            res[i]=t;
        }
        return res;
    }
}