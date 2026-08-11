class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] stepCost = new int[len];
        stepCost[0] = cost[0];
        stepCost[1] = cost[1];
        for(int i = 2; i < len; i++){
            int cur = cost[i];
            stepCost[i] = Math.min(stepCost[i-1] + cur, stepCost[i-2] + cur);
        }
        return Math.min(stepCost[len - 1], stepCost[len - 2]);
    }
}
