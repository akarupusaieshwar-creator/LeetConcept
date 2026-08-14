class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0,j = 0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.get(nums[i]) > k){
                if(map.get(nums[j]) > 1){
                    map.put(nums[j],map.get(nums[j]) - 1);
                }
                else{
                    map.remove(nums[j]);
                }
                j++;
            }
            ans = Math.max(ans,i - j + 1);
            // System.out.println(ans);
        }
        return ans;
    }
    // public boolean val(HashMap<Integer,Integer> map,int k){
    //     for(int i : map.keySet()){
    //         if(map.get(i) > k){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
}