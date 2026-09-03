class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = Integer.MAX_VALUE;
        for(int i : nums1){
            n = Math.min(n,i);
        }
        // boolean val = n % 2 == 0 ? true : false;
        for(int i : nums1){
            if(n % 2 == i % 2){
                continue;
            }
            if((i-n) % 2 != n % 2){
                return false;
            }
        }
        return true;
    }
}