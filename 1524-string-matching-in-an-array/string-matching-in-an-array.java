class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> al=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(j!=i && words[j].contains(words[i])){
                    al.add(words[i]);
                    break;
                }
            }
        }
        return al;
    }
}