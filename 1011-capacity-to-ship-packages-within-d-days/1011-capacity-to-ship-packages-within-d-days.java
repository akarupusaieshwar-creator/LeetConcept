class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0, h = 0;
        for(int i : weights){
            l = Math.max(l,i);
            h += i;
        }
        int ans = h;
        while(l <= h){
            int mid = l + (h - l) / 2;
            System.out.println("|| " + mid+" " +l+" "+h);
            if(val(weights,mid,days)){
                h = mid - 1;
                ans = mid;
            }else{
                l = mid + 1;
            }
        }
        return ans;
    }
    public boolean val(int[] arr,int mid,int k){
        int c = 1,sum = 0;
        for(int i : arr){
            if(sum + i > mid){
                c++;
                sum = i;
            }else{
                sum += i;
            }
        }
        return c <= k;
    }
}