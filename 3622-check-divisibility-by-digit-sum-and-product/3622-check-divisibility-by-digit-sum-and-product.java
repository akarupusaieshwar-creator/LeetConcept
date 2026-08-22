class Solution {
    public boolean checkDivisibility(int n) {
        int t = n;
        int sum = 0,p = 1;
        while(t > 0){
            int r = t % 10;
        // System.out.println(sum + "||" + p ); 
            p *= r;
            sum += r ;
            t = t / 10;
        } 
        return n % (sum+p) == 0;
    }
}