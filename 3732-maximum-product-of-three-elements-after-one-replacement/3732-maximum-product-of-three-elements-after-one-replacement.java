class Solution {
    public long maxProduct(int[] nums) {
        // int n = nums.length;
        // Arrays.sort(nums);
        // return (long)Math.max(Math.abs((long)nums[0]*nums[n-1]) ,Math.max(Math.abs((long)nums[0]*nums[1]) , Math.abs((long)nums[n-1]*nums[n-2]))) * (long)100000;
        int m1 , m2;
        m1 = m2 = Integer.MIN_VALUE;
        for(int i : nums){
            i = Math.abs(i);
            if(i > m1){
                m2 = m1;
                m1 = i;
            }else if(i > m2){
                m2 = i;
            }
        }
        return (long)m1 * m2 * 100000;
    }
}