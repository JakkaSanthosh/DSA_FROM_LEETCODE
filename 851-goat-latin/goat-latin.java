class Solution {
    public String toGoatLatin(String s) {
       String a[]=s.split("\\s+");
       String x="";
       for(int i=0;i<a.length;i++){
        StringBuilder sb=new StringBuilder(a[i]);
        if("aeiouAEIOU".indexOf(sb.charAt(0))!=-1){
            sb.append("ma");
        }
        else{
            char c=sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(c);
            sb.append("ma");
        }
        sb.append("a".repeat(i+1));
        x+=sb.toString()+" ";
       }
       return x.trim(); 
    }
}