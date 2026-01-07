class Solution {
    public int[] findArray(int[] pref) {
        int ori[]=new int[pref.length];
        int n=pref.length;
        ori[0]=pref[0];
        int xor=pref[0];
        for(int i=1;i<n;i++){
            ori[i]=xor^pref[i];
            xor^=ori[i];
        }
        return ori;
    }
}