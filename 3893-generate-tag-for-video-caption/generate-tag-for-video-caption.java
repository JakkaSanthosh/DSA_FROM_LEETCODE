class Solution {
    public String generateTag(String cap) {
        cap=cap.trim();
        if(cap.length()==0) return"#";
        String a[]=cap.split("\\s+");
        StringBuilder sb=new StringBuilder();
        sb.append('#');
        for(int i=0;i<a.length;i++){
            if(i==0){
                sb.append(Character.toLowerCase(a[i].charAt(0)));
                sb.append(a[i].substring(1).toLowerCase());
            }
            else{
                sb.append(Character.toUpperCase(a[i].charAt(0)));
                 sb.append(a[i].substring(1).toLowerCase());
            }
        }
        if(sb.length()>100) return sb.substring(0,100).toString();
        return sb.toString();
    }
}