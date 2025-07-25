class Solution {
    public String largestNumber(int[] nums) {
        String a[]=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            a[i]=nums[i]+"";
        }

        Arrays.sort(a,(x,y)->{
            return (y+x).compareTo(x+y);
        });
        if(a[0].equals("0")) return "0";
        StringBuilder sb=new StringBuilder();
        for(var i:a) sb.append(i);
        return sb.toString();
    }
}