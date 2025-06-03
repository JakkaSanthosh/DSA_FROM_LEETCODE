class Solution {
    public int uniqueMorseRepresentations(String[] words) {
       Set<String> hs=new HashSet<>();
       String a[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
       for(int i=0;i<words.length;i++){
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<words[i].length();j++){
            sb.append(a[words[i].charAt(j)-'a']);
        }
        hs.add(sb.toString());
       } 
       return hs.size();
    }
}