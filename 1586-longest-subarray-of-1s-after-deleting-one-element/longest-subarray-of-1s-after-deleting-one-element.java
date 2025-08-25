class Solution {
    public int longestSubarray(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            sb.append(num);
        }
        String s = sb.toString();
        String a[]=s.split("0");
        int len=0,f=0;
    
        if(a.length==1) return s.contains("0")?a[0].length():a[0].length()-1;
        for(int i=0;i<a.length-1;i++){
            System.out.println(a[i]);
            int max=a[i].length()+a[i+1].length();
           // System.out.println(max);
            if(a[i].equals(" ")&&i>0){
                len=Math.max(len,(a[i-1].length()+a[i+1].length()));
                f=1;
            }
            else len=Math.max(len,max);
            
        }
        //if(f==0&&len>0) return len-1;
        return len;
    }
}