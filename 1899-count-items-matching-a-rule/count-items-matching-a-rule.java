class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c=0;
        int idx;
        if(ruleKey.equals("type")) idx=0;
        else if(ruleKey.equals("color")) idx=1;
        else idx=2;
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(idx).equals(ruleValue)) c++;
        }
        return c;
    }
}