class Solution {
    public int minInsertions(String s) {
        int n = s.length(),ans = 0,need = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '('){
                need+=2;
                if(need % 2 != 0){
                    ans++;
                    need--;
                }
            }else{
                need--;
                if(need < 0){
                    ans++;
                    need=1;
                }
            }
        }
        return ans + need;
    }
}