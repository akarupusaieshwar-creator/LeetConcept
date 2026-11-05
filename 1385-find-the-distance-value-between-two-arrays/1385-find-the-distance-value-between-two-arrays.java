class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res = 0;
        for(int i : arr1){
            if(fun(i,arr2,d)) res++;
        }
        return res;
    }
    public boolean fun(int n,int[] arr,int d){
        for(int i : arr){
            if(Math.abs(i-n) <= d){
                return false;
            }
        }
        return true;
    }
}