class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int costprice=0;  
        if(cost.length==2) return Math.min(cost[0],cost[1]);
        for(int i=2;i<cost.length;i++) cost[i]=Math.min(cost[i-1],cost[i-2])+cost[i];
        return Math.min(cost[cost.length-1],cost[cost.length-2]);
}}