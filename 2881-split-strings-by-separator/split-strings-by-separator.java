import java.util.*;

class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        for(int i=0;i<words.size();i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<words.get(i).length();j++){
                if(words.get(i).charAt(j)==separator){
                 if(sb.length()!=0) result.add(sb.toString());
                  sb=new StringBuilder();
                }
                else sb.append(words.get(i).charAt(j));
            }
           if(sb.length()!=0) result.add(sb.toString());
        }
        return result;
           }
}
