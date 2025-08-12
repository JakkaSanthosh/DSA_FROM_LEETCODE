class Solution {
    public boolean reorderedPowerOf2(int n) {
        String target = Sorted(n+"");
        for(int i=0;i<31;i++){
            if(Sorted((1<<i)+"").equals(target)) return true;
        }
        return false;
    }
    static String Sorted(String s){
        char a[]=s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }

}