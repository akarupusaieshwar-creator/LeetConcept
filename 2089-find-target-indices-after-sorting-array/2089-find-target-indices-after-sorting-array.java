class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int before = 0, count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target) count++;
            else if(nums[i] < target) before++;
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<count;i++){
            res.add(before + i);
        }
        return res;
    }
}
