class Solution {
    public int totalFruit(int[] fruits) {
    Map<Integer,Integer> mp=new HashMap<>(); 
        int max=0,i=0,j=0;
        while(j<fruits.length){
            mp.put(fruits[j],1+mp.getOrDefault(fruits[j],0));
            while(mp.size()>2){
               mp.put(fruits[i],mp.get(fruits[i])-1);
               if(mp.get(fruits[i])==0) mp.remove(fruits[i]);
               i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
     return max;
    }
}