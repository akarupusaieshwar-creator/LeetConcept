class Solution {
    public int minMoves(int[] nums) {
        int res = 0,max = Integer.MAX_VALUE;
        for(int i : nums) max = Math.min(max,i);
        for(int i : nums) res += i - max;
        return res;
    }
}