class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
      for(int i=0;i<nums.length;i++){
        List<Integer> al=new ArrayList<>();
        for(int j=1;j<=nums[i]/j;j++){
            if(nums[i]%j==0){
                al.add(j);
                al.add(nums[i]/j);
            }
            if(j==nums[i]/j) al.remove(Integer.valueOf(j));
        }
        if(al.size()==4){
            for(var k:al) sum+=k;
        }
      }
    return sum;
    }
}