class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1 , hi = 0;
        for(int i : piles){
            hi = Math.max(hi,i);
        }
        int ans = 0;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(isValid(piles,h,mid)){
                ans = mid;
                hi = mid - 1;
            }
            else{
                lo = mid + 1;
            }
        }
        return ans;
    }
    public boolean isValid(int[] arr,int k,int mid){
        int ans = 0;
        for(int i : arr){
            ans +=  Math.ceil((double)i/mid);
            if(ans > k){
                return false;
            }
        }
        return true;
    }
} 