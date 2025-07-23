class Solution {
    public int maximumGain(String s, int x, int y) {
        int res=0;
        if(x>y) return helper(s,'a','b',x,y);
        return helper(s,'b','a',y,x);
    }
    static int helper(String s,char ch1,char ch2,int x,int y){
        int res=0;
        Stack<Character> st=new Stack<>();
        for(var i:s.toCharArray()){
            if(!st.isEmpty()&&st.peek()==ch1&&i==ch2){
                res+=x;
                st.pop();
            }
            else{
                st.push(i);
            }
        }
        String k="";
        while(!st.isEmpty()){
            k=st.pop()+k;
        }
        for(var i:k.toCharArray()){
            if(!st.isEmpty()&&st.peek()==ch2&&i==ch1){
                res+=y;
                st.pop();
            }
            else{
                st.push(i);
            }
        }
        return res;
    }
}