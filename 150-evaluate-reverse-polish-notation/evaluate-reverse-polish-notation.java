class Solution {
    public int evalRPN(String[] s) {
       Stack<Integer> st=new Stack<>();
       for(int i=0;i<s.length;i++){
         if(s[i].equals("+")||s[i].equals("-")||s[i].equals("/")||s[i].equals("*")){
            int b=st.pop();
            int a=st.pop();
            String x=s[i];
            switch(x){
                case "+": st.push(a+b); break;
                case "-": st.push(a-b); break;
                case "*": st.push(a*b); break;
                case "/": st.push((b!=0)?a/b:0); break;
            }
         }
         else st.push(Integer.parseInt(s[i]));
       }
       return st.peek();
    }
}