class Solution {
    public int compareVersion(String version1, String version2) {
        String a[]=version1.split("\\.");
        String b[]=version2.split("\\.");
        int max=Math.max(a.length,b.length);
        for(int i=0;i<max;i++){
            int n1=i<a.length?Integer.parseInt(a[i]):0;
            int n2=i<b.length?Integer.parseInt(b[i]):0;
            if(n1>n2) return 1;
            else if(n1<n2) return -1;
        }
           return 0;
    }
}