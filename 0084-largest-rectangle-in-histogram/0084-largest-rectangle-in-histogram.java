class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] l = fsl(heights,n);
        int[] r = fsr(heights,n);
        int ans = 0;
        for(int i=0;i<n;i++){
            int p1 = l[i];
            int p2 = r[i];
            ans = Math.max(ans,(p2-p1-1) * heights[i]);
        }
        return ans;
    }
    public int[] fsl(int[] arr,int n){
        int[] t = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                t[st.pop()] = i;
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            t[st.pop()] = -1;
        }
        return t;
    }
    public int[] fsr(int[] arr,int n){
        int[] t = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                t[st.pop()] = i;
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            t[st.pop()] = n;
        }
        return t;
    }
}