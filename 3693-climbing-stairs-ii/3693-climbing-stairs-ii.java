class Solution {
    public int climbStairs(int n, int[] c) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = c[0] + 1;
        for(int i=2;i<=n;i++){
            if(i == 2)dp[2] = Math.min(dp[1]+1,dp[0]+4) + c[1];
            else dp[i] = Math.min(dp[i-1]+1,Math.min(dp[i-2]+4,dp[i-3]+9)) + c[i - 1];
        }
        // System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}