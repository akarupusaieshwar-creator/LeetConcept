class Solution {
    int[] dp;
    public int fib(int n) {
        dp = new int[n+1];
        return fun(n);
    }
    public int fun(int n){
        if(n == 0){
            return dp[0] = 0;
        }
        if(n == 1){
            return dp[1] = 1;
        }
        if(dp[n] != 0) {
            return dp[n];
        }
        dp[n] = fun(n-1) + fun(n-2);
        return dp[n];
    }
}