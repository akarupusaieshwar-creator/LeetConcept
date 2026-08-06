class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] r = new int[n];
        int[] l = new int[n];
        for(int i=1;i<n;i++){
            l[i] = l[i-1] + nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            r[i] = r[i+1] + nums[i+1];
        }
        for(int i=0;i<n;i++){
            int t = Math.abs(r[i] - l[i]);
            r[i] = t;
        }
        return r;
    }
}