class Solution {
    public int[][] dp ;
    public int numDistinct(String s, String t) {
        dp = new int[s.length()][t.length()];
        for(int i=0;i<s.length();i++){
            Arrays.fill(dp[i],-1);
        }
        return fun(s,t,0,0);
    }
    public int fun(String s,String t,int i,int j){
        if(j == t.length()) return 1;
        if(i == s.length()) return 0;
        int res = 0;
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        else if(s.charAt(i) == t.charAt(j)){
            res += fun(s,t,i+1,j+1) + fun(s,t,i+1,j);
        }
        else{
            res += fun(s,t,i+1,j);
        }
        dp[i][j] = res;
        return res;
    }

}