class Solution {
    public int maxRepeating(String seq, String word) {
        int c=0;
        StringBuilder sb=new StringBuilder(word);
        while(seq.contains(sb.toString())){
            c++;
            sb.append(word);
        }
        return c;
    }
}