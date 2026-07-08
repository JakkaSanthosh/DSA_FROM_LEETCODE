class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> al=new ArrayList<>();
        TreeSet<Integer> st=new TreeSet<>();
        al.add(nums[0]);
        st.add(0);
        st.add(nums.length-1);
        for(int i=1;i<nums.length-1;i++){
            int max=Collections.max(al);
            if(nums[i]>max) st.add(i);
            al.add(nums[i]);
        }
        al.clear();
        al.add(nums[nums.length-1]);
        for(int i=nums.length-2;i>0;i--){
            int max=Collections.max(al);
            if(nums[i]>max) st.add(i);
            al.add(nums[i]);
        }
        al.clear();
        for(var i:st){
            al.add(nums[i]);
        }
        return al;
    }
}