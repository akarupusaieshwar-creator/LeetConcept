class Solution {
    public int maximumLengthSubstring(String s) {
        int[] count = new int[26];
        int max = 0,j = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            count[c - 'a']++;
            while(count[c - 'a'] > 2){
                char r = s.charAt(j);
                count[r - 'a']--;
                j++;
            }
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}