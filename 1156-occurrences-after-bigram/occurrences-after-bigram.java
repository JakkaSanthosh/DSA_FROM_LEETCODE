class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String a[]=text.split("\\s+");
        List<String> al=new ArrayList<>();
        for(int i=0;i<a.length-2;i++){
            if(a[i].equals(first)&&a[i+1].equals(second)) {
                al.add(a[i+2]);}
        }
        String b[]=new String[al.size()];
        for(int i=0;i<al.size();i++) b[i]=al.get(i);
        return b;
            }
}