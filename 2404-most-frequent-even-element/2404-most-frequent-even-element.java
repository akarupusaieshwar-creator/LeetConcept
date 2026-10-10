class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length;
        int even = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(i % 2 == 0){
                even++;
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        if(even == 0) return -1;
        int ans = 0,fre = 0;
        for(int i : map.keySet()){
            if(map.get(i) > fre){
                fre = map.get(i);
                ans = i;
            }
            else if(map.get(i) == fre){
                if(ans > i) ans = i;
            }
        }
        return ans;
    }
}