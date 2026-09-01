class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] t = Arrays.copyOf(nums2,m);
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<m;i++){
            while(!st.isEmpty() && nums2[st.peek()] < nums2[i]){
                t[st.pop()] = nums2[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            t[st.pop()] = -1;
        }
        System.out.println(Arrays.toString(t));
        int[] r = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums1[i] == nums2[j]){
                    r[i] = t[j];
                    // System.out.println(t[j] + " "+r[i]);
                }
            }
        }
        return r;
    }
}