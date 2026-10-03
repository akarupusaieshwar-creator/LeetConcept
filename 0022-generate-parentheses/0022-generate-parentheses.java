class Solution {
        List<String> res;
    public List<String> generateParenthesis(int n) {
        res = new  ArrayList<>();
        fun(2*n,0,0,"");
        return res;
    }
    public void fun(int n,int co,int cc,String s){
        if(s.length() == n){
            res.add(s);
            return;
        }
        if(co < n / 2){
            fun(n,co+1,cc,s+"(");
        }
        if(cc < co){
            fun(n,co,cc+1,s+")");
        }
    }
}