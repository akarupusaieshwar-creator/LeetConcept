class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int m = nums[nums.length/2],r = 0;
        for(int i : nums) r += Math.abs(i-m);
        return r;
    }
}