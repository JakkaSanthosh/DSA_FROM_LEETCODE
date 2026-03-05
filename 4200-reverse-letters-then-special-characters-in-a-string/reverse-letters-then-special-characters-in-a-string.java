class Solution {
    public String reverseByType(String s) {
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        String res="";
        for(var i:s.toCharArray()){
           if(i>=97&&i<=122) st1.push(i);
           else st2.push(i);
        }
        for(var i:s.toCharArray()){
           if(i>=97&&i<=122) res+=st1.pop();
           else res+=st2.pop();
        }
        return res;
     }
}