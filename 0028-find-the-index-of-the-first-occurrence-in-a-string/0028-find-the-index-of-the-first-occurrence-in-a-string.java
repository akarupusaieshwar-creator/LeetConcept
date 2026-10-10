class Solution {
    public int strStr(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(m == 0) return 0;
        if(n < m) return -1;
        long[] prime = new long[n+1];
        prime[0] = 1;
        int p = 29;
        for(int i=1;i<=n;i++){
            prime[i] = prime[i-1] * p;
        }
        long pre = 0;
        for(int i=0;i<m;i++){
            pre += (long)s2.charAt(i) * prime[i+1];
        }
        long[] spre = new long[n+1];
        spre[0] = 0;
        for(int i=0;i<n;i++){
            spre[i+1] = (long)s1.charAt(i) * prime[i+1] + spre[i];
        }
        for(int i=m;i<=n;i++){
            if(spre[i] - spre[i-m] == pre * prime[i-m]){
                if(s1.substring(i-m,i).equals(s2)) 
                   return i-m;
            }
        }
        return -1;
    }
}