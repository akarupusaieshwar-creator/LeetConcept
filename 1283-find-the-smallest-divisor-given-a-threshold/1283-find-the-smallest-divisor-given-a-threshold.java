class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1,h = 0,ans = 0;
        // Arrays.sort(nums);
        for(int i : nums){
            h = Math.max(h,i);
        }
        while(l <= h){
            int mid = l + (h - l) / 2;
            if(isValid(nums,mid,threshold)){
                // ans = Math.max(ans,mid);
                ans = mid;
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return ans;
    }
    public static boolean isValid(int[] arr,int mid,int k){
        int ans = 0;
        for(int i : arr){
            ans += (i + mid - 1) / mid ;
        }
        return ans <= k;
    }
}