class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int val = 0;
        for(int i=0;i<n;i++){
            if(i > val) return false;
            val = Math.max(nums[i]+i,val);
            if(val >= n - 1) return true;
        }
        return false;
    }
}