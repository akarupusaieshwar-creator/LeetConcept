class Solution {
    int[] dp ;
    public int tribonacci(int n) {
        dp = new int[n+1];
        return fun(n);
    }
    public int fun(int n){
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] =  fun(n-2) + fun(n-1) + fun(n-3);
        return dp[n];
    }
}