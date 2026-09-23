class Solution {
    int[] dp ;
    public int climbStairs(int n) {
        dp = new int[n+1];
        dp[0] = dp[1] = 1;
        return fun(n);
    }
    public int fun(int n){
        if(n <= 1) return dp[n];
        if(dp[n] != 0) return dp[n];
        dp[n] = fun(n-1) + fun(n-2);
        return dp[n];
    }
}