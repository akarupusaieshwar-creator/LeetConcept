class Solution {
    private List<List<Integer>> ans;

    private void helper(List<Integer> curr, int i, int n, int[] nums) {
        if (i== n) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        helper(curr, i+1, n, nums);
        curr.remove(curr.size() - 1);
        helper(curr, i+1, n, nums);
    }

    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        ans = new ArrayList<>();
        helper(new ArrayList<>(), 0, n, nums);
        return ans;
    }
}