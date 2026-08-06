class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        // if(n % 2 == 0) return -1;
        int[] l = new int[n];
        int[] r = new int[n];
        l[0] = nums[0];
        r[n-1] = nums[n-1]; 
        for(int i=1;i<n;i++){
            l[i] = l[i-1] + nums[i];
        }
        for(int i=n-2;i>=0;i--){
            r[i] = r[i+1] + nums[i];
        }
        for(int i=0;i<n;i++){
            if(l[i] == r[i]){
                return i;
            }
        }

        return -1;
    }
}