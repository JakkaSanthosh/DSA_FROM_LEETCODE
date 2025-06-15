class Solution {
    public String generateTag(String cap) {
        cap=cap.trim();
        if(cap.length()==0) return"#";
        String a[]=cap.split("\\s+");
        StringBuilder sb=new StringBuilder();
        sb.append('#');
        for(int i=0;i<a.length;i++){
            char ch= (i==0)?Character.toLowerCase(a[i].charAt(0)):Character.toUpperCase(a[i].charAt(0));
            sb.append(ch);
                sb.append(a[i].substring(1).toLowerCase());       
        }
       return sb.length()>100 ?sb.substring(0,100).toString():sb.toString();
       
    }
}