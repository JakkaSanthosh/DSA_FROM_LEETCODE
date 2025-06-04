class Solution {
    public int minDeletionSize(String[] strs) {
        int c=0;
        int length=strs[0].length();
        int i=0;
        while(i<length){
            for(int j=0;j<strs.length-1;j++){
               if(strs[j].charAt(i)>strs[j+1].charAt(i)){
                 c++;
                 break;}
            }
            i++;
        }
        return c;
    }
}
