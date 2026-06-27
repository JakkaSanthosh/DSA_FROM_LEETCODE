class Solution {
    public int minimumSwaps(int[] nums) {
    Set<Integer> hs=new HashSet<>();
    int zc=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
        zc++;
        hs.add(i);
        }
    }
    int i=1,cnt=0;
    while(zc-->0){
        if(!hs.contains(nums.length-i)) cnt++;
        i++;
    }
    return cnt;
    }
}