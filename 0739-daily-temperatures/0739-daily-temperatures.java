class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        int j = 0;
        for(int i=0;i<n;i++){
            int c = 0;
            while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i]){
                res[st.pop()] = i;
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            res[st.pop()] = 0;
        }
        for(int i=0;i<n;i++){
            if(res[i]!=0) res[i] = res[i] - i;
        }
        return res;
    }
}