class Solution {
    public int minAddToMakeValid(String s) {
        int oc=0,cc=0,c=0;
        for(var i:s.toCharArray()){
            if(i=='(') oc++;
            else {
                if(oc==0) c++;
                else oc--;}
        }
        return c+oc;
    }
}