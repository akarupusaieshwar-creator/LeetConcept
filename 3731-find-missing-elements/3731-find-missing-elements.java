class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int s = nums[0],l = nums[0];
        HashSet<Integer> h = new HashSet<>();
        for(int i : nums){
            if(s > i){
                s = i;
            }
            if(l < i){
                l = i;
            }
            h.add(i);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=s;i<=l;i++){
            if(!h.contains(i)){
                arr.add(i);
            }
        }
        return arr;
    }
}