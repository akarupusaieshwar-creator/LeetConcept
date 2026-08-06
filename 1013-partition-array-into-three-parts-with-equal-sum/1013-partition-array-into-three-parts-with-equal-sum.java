class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        if(sum % 3 != 0) return false;
        int c = 0;
        int t = sum / 3;
        sum = 0;
        for(int i=0;i<arr.length-1;i++){
            sum += arr[i];
            if(sum == t * (c + 1)){
                c++;
                if(c == 2){
                    break;
                }
            }
        }
        return c >= 2;
    }
}