class Solution {
    public int mySqrt(int x) {
        int l = 0,h = x;
        while(l <= h){
            int m = l + (h - l) / 2;
            // System.out.println(m + " " + l + " "+ h);
            long ans =(long) m * m;
            if(ans == x){
                return m;
            }
            if(ans < x){
                l = m + 1;
            }else{
                h = m - 1;
            }
        }
        return h;
    }
}