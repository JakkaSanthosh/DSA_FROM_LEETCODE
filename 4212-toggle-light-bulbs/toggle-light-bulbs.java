class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
       List<Integer> al=new ArrayList<>();
       for(var i:bulbs){
        if(!al.contains(i)) al.add(i);
        else al.remove(i);
       } 
       Collections.sort(al);
       return al;
    }
}