class Solution {
    public int minimumOperations(int[] a) {
       int c=0,i=0;
        while(!check(a,i)){
            c++;
            i+=3;
        }
        return c;
    }
   boolean check(int a[],int i){
       Set<Integer> st=new HashSet<>();
       for(int k=i;k<a.length;k++){
           if(!st.contains(a[k]))st.add(a[k]);
           else return false;
       }
       return true;
   }
}