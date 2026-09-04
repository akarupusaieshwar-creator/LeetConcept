class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int m = nums[0];
        int n = nums.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            m = Math.max(m,nums[i]);
            arr[i] = m;
        }
        m = arr[n-1];
        for(int i=n-1;i>=0;i--){
            m = Math.min(m,nums[i]);
            arr[i] -= m;
        }
        for(int i=0;i<n;i++){
            if(arr[i] <= k){
                return i;
            }
        }
        // System.out.println(Arrays.toString(arr));
        return -1;
    }
}