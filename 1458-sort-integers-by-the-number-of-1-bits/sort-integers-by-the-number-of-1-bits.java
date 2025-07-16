class Solution {
    public int[] sortByBits(int[] arr) {
         
        Integer[] al=new Integer[arr.length];
        for(int i=0;i<arr.length;i++) al[i]=arr[i];
        Arrays.sort(al,(a,b)->{
            int ba=Integer.bitCount(a);
            int bb=Integer.bitCount(b);
            if(ba!=bb) return ba-bb;
             return a-b;
        });
        for(int i=0;i<al.length;i++) arr[i]=al[i];
        return arr;
    }
}