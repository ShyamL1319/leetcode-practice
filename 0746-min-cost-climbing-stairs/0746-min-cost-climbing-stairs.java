class Solution {

    public int minCostClimbingStairs(int[] cost, int idx, int memo[]) {
        if (cost.length - 1 == idx || cost.length - 2 == idx) {
            return cost[idx];
        }

        if (memo[idx] != 0) {
            return memo[idx];
        }

        int oneStep = minCostClimbingStairs(cost, idx + 1, memo);
        int twoStep = minCostClimbingStairs(cost, idx + 2, memo);
        memo[idx] = Math.min(oneStep, twoStep) + cost[idx];
        return memo[idx];
    }

    public int minCostClimbingStairs(int[] cost) {
        int memo[] = new int[cost.length + 1];
        if (cost.length == 2) return Math.min(cost[0], cost[1]);

        int zeroIndxCost = minCostClimbingStairs(cost, 0, memo);
        int oneIdxCost = minCostClimbingStairs(cost, 1, memo);

        return Math.min(zeroIndxCost, oneIdxCost);
    }
}
