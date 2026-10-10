class Solution {
    public int minSwaps(String s) {
        int n = s.length(); 
        if(n == 0) return 0;
        int count = 0,ans = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '['){
                count++;
            }
            else{
                count--;
                if(count < 0){
                    ans++;
                    count = 1;
                }
            }
        }
        return ans;
    }
}