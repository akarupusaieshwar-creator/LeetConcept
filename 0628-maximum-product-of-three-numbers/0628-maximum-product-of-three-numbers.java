class Solution {
    public int maximumProduct(int[] nums) {
        // int x , y, z ;
        // x = y = z = Integer.MIN_VALUE;
        // for(int i : nums){
        //     if( i > x){
        //         z = y;
        //         y = x;
        //         x = i;
        //     }else if ( i > y){
        //         z = y;
        //         y = i;
        //     }else if(i > z){
        //         z = i;
        //     }
        // }
        // return x * y * z;
        Arrays.sort(nums);
        int s = nums.length;
        return Math.max(nums[0]*nums[1]*nums[s-1],nums[s-1] * nums[s-2] * nums[s-3]);
    }
}