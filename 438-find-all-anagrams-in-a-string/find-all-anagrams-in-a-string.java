class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> al=new ArrayList<>();
        char a[]=p.toCharArray();
        Arrays.sort(a);
        p=new String(a);
        for(int i=0;i<s.length()-p.length()+1;i++){
            if(checkAnagram(s.substring(i,i+p.length()),p)) al.add(i);
        }
        return  al;
    }
    static boolean checkAnagram(String p,String s){
        char a[]=p.toCharArray();
        Arrays.sort(a);
        p=new String(a);
        return p.equals(s);
    }
}