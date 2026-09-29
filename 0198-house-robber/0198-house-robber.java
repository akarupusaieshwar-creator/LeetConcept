class Solution {
    int[] dp;
    public int fun(int[] nums,int n){
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        if(dp[n] != -1) return dp[n];
        int t = fun(nums,n-2) + nums[n-1];
        int nt = fun(nums,n-1);
        return dp[n] = Math.max(nt,t);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return fun(nums,n);
    }
}