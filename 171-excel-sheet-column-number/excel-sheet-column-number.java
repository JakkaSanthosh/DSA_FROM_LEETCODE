class Solution {
    public int titleToNumber(String columnTitle) {
        int ans=0;
        for(var i:columnTitle.toCharArray()) ans=ans*26+(i-'A'+1);
    return ans;
    }
}