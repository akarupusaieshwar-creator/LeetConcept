class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] max = new int[n];
        int[] min = new int[n];
        int mx = nums[0];
        int mn = nums[n-1];
        max[0] = nums[0];
        min[n-1] = nums[n-1];
        for(int i=1;i<n;i++){
            mx = Math.max(mx,nums[i]);
            max[i] = mx;
        }
        for(int i=n-2;i>=0;i--){
            mn = Math.min(mn,nums[i]);
            min[i] = mn;
        }
        for(int i=0;i<n;i++){
            if(max[i] - min[i] <= k){
                 return i;
            }
            
        }
        return -1;
    }
}