class Solution {
    public int maxFrequencyElements(int[] nums) {
       Map<Integer,Integer> m=new HashMap<>();
       for(int i:nums) m.put(i,1+m.getOrDefault(i,0)); 
       int max=0,sum=0;
       for(int i:m.keySet()){
        max=Math.max(max,m.get(i));
       }
       for(int i:m.keySet()){
        if(m.get(i)==max) sum+=m.get(i);
       }
       return sum;
    }
}