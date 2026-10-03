class Solution {
    public int pivotInteger(int n) {
        if(n == 1) return 1;
        int sum = (n * (n+1))/2;
        int res = 0;
        for(int i=n;i>0;i--){
            if(sum - i == res) return i;
            sum -= i;
            res += i;
        }
        return -1;
    }
}