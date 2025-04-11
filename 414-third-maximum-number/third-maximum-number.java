class Solution {
    public int thirdMax(int[] nums) {
    List<Integer> al=new ArrayList<>();
    for(var i:nums){
        if(!al.contains(i)) al.add(i);
    }
    Collections.sort(al);
    if(al.size()<3) return al.get(al.size()-1);
    return al.get(al.size()-3);
    }
}