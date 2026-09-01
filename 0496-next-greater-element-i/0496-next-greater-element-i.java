class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        for(int i=0;i<n;i++){
            nums1[i] = fun(nums2,nums1[i]);
        }
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<m;i++){
            while(!st.isEmpty() && nums2[st.peek()] < nums2[i]){
                nums2[st.pop()] = nums2[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            nums2[st.pop()] = -1;
        }
        for(int i=0;i<n;i++){
            nums1[i] = nums2[nums1[i]];
        }
        return nums1;
    }
    public int fun(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }
}