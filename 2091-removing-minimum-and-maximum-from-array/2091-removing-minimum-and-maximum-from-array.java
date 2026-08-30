class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        for(int i : nums){
            min = Math.min(i,min);
            max = Math.max(i,max);
        }
        int n = nums.length;
        int i=0,j=0;
        while(nums[i] != min){
            i++;
        }
        while(nums[j] != max){
            j++;
        }
        int l = Math.max(i,j)+1;
        int r = n - Math.min(i,j);
        int b = Math.min(i,j) + 1 + n - Math.max(i,j);
        return Math.min(l,Math.min(r,b));
    }
}