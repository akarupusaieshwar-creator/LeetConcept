class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> s = new TreeSet<>();
        for(int i=0;i<n;i++){
            s.add(nums[i]);
        }
        int m = k;
        while(s.contains(m)){
            m += k;
        }
        return m;
    }
}