class Solution {
    public int minMoves(int[] nums) {
        int res = 0,max = Integer.MAX_VALUE;
        for(int i : nums) {
            res += i;
            if(i < max) max = i;
        }
        return res - nums.length * max;
    }
}