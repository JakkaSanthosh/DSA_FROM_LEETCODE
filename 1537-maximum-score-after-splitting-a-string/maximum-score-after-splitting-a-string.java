class Solution {
    public int maxScore(String s) {
        int n=s.length();
        int za[]=new int[s.length()];
        int oa[]=new int[s.length()];
        za[0]=(s.charAt(0)=='0')?1:0;
        oa[n-1]=(s.charAt(n-1)=='0')?0:1;
    for(int i=1;i<n;i++){
        za[i]=za[i-1]+((s.charAt(i)=='0')?1:0);
    }
    for(int i=n-2;i>=0;i--){
        oa[i]=oa[i+1]+((s.charAt(i)=='0')?0:1);
    }
    int ans=0;
    for(int i=0;i<n-1;i++){
        ans=Math.max(ans,oa[i+1]+za[i]);
    }
    return ans;
    }
}