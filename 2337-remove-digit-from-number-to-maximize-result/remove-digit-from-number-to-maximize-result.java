class Solution {
    public String removeDigit(String num, char digit) {
        String max="0";
        StringBuilder sb=new StringBuilder(num);
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            if(ch==digit){
                String s=num.substring(0,i)+num.substring(i+1);
               if(max.compareTo(s)<0) max=s;
            }
         }
         return max;
    }
}