class Solution {
    int[] dp ;
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        dp = new int[n+1];
        for(int i=0;i<=n;i++) dp[i] = -1;
        dp[0] = 0;
        dp[1] = 0;
        return fun(n,cost);
    }
    public int fun(int n,int[] cost){
        if(dp[n] != -1) return dp[n];
        dp[n] = Math.min(fun(n-1,cost) + cost[n-1],fun(n-2,cost) + cost[n-2]);
        return dp[n];
    }
}