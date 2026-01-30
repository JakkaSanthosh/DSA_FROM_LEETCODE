class Solution {
    public int[] rotateElements(int[] nums, int k) {
        List<Integer> al=new ArrayList<>();
        List<Integer> idx=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0) {
                al.add(nums[i]);
                idx.add(i);
            }
        }
        int n = al.size();
        if (n == 0) return nums;
        k = k % n;
        if (k == 0) return nums;
        for (int j = 0; j < n; j++) {
            int index = (j + k) % n; 
            nums[idx.get(j)] = al.get(index);
        }
        return nums;
    }
}