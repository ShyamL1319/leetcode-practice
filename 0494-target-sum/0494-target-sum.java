// backtracking approach
class Solution {
    Map<Map.Entry<Integer, Integer>, Integer> map;

    public int findTargetSumWays(int[] nums, int s) {
        map = new HashMap<>();
        return dp(nums, s, nums.length - 1, 0);
    }

    private int dp(int[] nums, int target, int index, int curSum) {
        Map.Entry<Integer, Integer> entry = Map.entry(index, curSum);
        if (map.containsKey(entry)) return map.get(entry);

        if (index < 0 && curSum == target) return 1;
        if (index < 0) return 0;

        int pos = dp(nums, target, index - 1, nums[index] + curSum);
        int neg = dp(nums, target, index - 1, -nums[index] + curSum);

        entry = Map.entry(index, curSum);
        map.put(entry, pos + neg);

        return pos + neg;
    }
}
// dp approach
// class Solution {
//     public int findTargetSumWays(int[] nums, int target) {
//         int sum = 0;
//         int n = nums.length;
//         for (int i = 0; i < n; i++) {
//             sum += nums[i];
//         }
//         if ((target + sum) % 2 != 0) return 0;
//         int m = (target + sum) / 2;
//         if (m < 0) return 0;
//         int dp[][] = new int[n + 1][m + 1];
//         for (int i = 1; i <= m; i++) {
//             dp[0][i] = 0;
//         }
//         for (int i = 0; i <= n; i++) {
//             dp[i][0] = 1;
//         }
//         for (int i = 1; i <= n; i++) {
//             for (int j = 0; j <= m; j++) {
//                 if (nums[i - 1] > j) {
//                     dp[i][j] = dp[i - 1][j];
//                 } else {
//                     dp[i][j] = (dp[i - 1][j] + dp[i - 1][j - nums[i - 1]]);
//                 }
//             }
//         }
//         return dp[n][m];
//     }
// }
