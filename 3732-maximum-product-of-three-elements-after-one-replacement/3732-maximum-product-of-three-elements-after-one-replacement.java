class Solution {
    public long maxProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return (long)Math.max(Math.abs((long)nums[0]*nums[n-1]) ,Math.max(Math.abs((long)nums[0]*nums[1]) , Math.abs((long)nums[n-1]*nums[n-2]))) * (long)100000;
    }
}