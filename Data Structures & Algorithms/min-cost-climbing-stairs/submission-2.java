

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];

        Arrays.fill(dp, -1);

        return Math.min(solve(n - 1, cost, dp),
                        solve(n - 2, cost, dp));
    }

    public int solve(int i, int[] cost, int[] dp) {
        if (i == 0 || i == 1) {
            return cost[i];
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        dp[i] = cost[i] + Math.min(
            solve(i - 1, cost, dp),
            solve(i - 2, cost, dp)
        );

        return dp[i];
    }
}
