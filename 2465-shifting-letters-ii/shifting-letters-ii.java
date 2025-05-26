class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        StringBuilder sb=new StringBuilder();
        int a[]=new int[s.length()+1];
        for(int i=0;i<shifts.length;i++){
            int stidx=shifts[i][0];
            int endidx=shifts[i][1];
            int dir=shifts[i][2];
            if(dir==0){
                a[stidx]-=1;
                a[endidx+1]+=1;
            }
            else{
                a[stidx]+=1;
                a[endidx+1]-=1;
            }
        }
        for(int i=1;i<a.length;i++) a[i]+=a[i-1];
        for(int i=0;i<s.length();i++){
              int shift=a[i]%26;
              if(shift<0) shift+=26;
              char ch=s.charAt(i);
              sb.append((char)((ch-'a'+shift)%26+'a'));
        }
        return sb.toString();
    }
}