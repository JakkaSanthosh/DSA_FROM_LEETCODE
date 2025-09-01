class Solution {
    public String longestWord(String[] words) {
       Arrays.sort(words,(a,b)->{
        if(a.length()!=b.length()) return a.length()-b.length();
        return a.compareTo(b);
       });
       for(var i:words) System.out.print(i+" ");
       String max="";int m=0;
       for(int i=1;i<words.length;i++){
         int cnt=0;
         for(int j=0;j<i;j++){
            if(words[i].startsWith(words[j])&&words[j].length()==cnt+1) cnt++;
         }
         if(cnt>m && cnt==words[i].length()-1){ max=words[i];m=cnt;}
       }
       
       return !max.isEmpty()?max:(words[0].length()==1?words[0]:"");
    }
}