class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
       Map<String,String> mp=new HashMap<>();
       for(var i:knowledge) mp.put(i.get(0),i.get(1)); 
       String res="";
       String x="";
       boolean f=false;
       for(var i:s.toCharArray()){
        if(i=='(') {
            f=true;
            x="";
        }
        else if(i==')'){
            res+=mp.getOrDefault(x,"?");
            f=false;
        }
        else{
            if(f) x+=i;
            else res+=i;
        }
       }
       return res;
    }
}