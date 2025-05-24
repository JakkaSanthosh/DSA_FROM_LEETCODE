class Solution {
    public String maximumTime(String time) {
        String x="";
        for(int i=0;i<time.length();i++){
            if(time.charAt(i)=='?'){
                if(i==0){
                    if(time.charAt(i+1)>=48&&time.charAt(i+1)<=51||time.charAt(i+1)=='?') x+=2+"";
                    else x+=1+"";
                }
                else if(i==3){
                    x+=5+"";
                }
                else if(i==1){
                    if(x.charAt(i-1)=='2') x+=3+"";
                    else x+=9+"";
                }
                else if(i==4){
                     x+=9+"";
                }
            }
            else x+=time.charAt(i);
        }
        return x;
    }
}