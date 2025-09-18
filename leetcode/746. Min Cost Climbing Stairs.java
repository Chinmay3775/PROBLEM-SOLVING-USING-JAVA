class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] mincost=new int[cost.length+1];
        for(int i=2;i<=cost.length;i++){
            mincost[i]=Math.min(
                (cost[i-1]+mincost[i-1]),
                (cost[i-2]+mincost[i-2])
            );
        }
        return mincost[cost.length];
    }
}
