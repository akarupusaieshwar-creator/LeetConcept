class Solution {
    public int smallestNumber(int n, int t) {
        int r = n;
        while(fun(r) % t != 0){
            r++;
        }
        return r;
    }
    public int fun(int n){
        int r = 1;
        while(n > 0){
            int d = n % 10;
            r *= d;
            n = n / 10;
        }
        return r;
    }
}