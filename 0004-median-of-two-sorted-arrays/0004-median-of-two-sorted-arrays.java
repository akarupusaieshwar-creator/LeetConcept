class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double res = 0;
        int i = 0,j = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                arr.add(nums1[i]);
                i++;
            }
            else{ 
                arr.add(nums2[j]);
                j++;
            }
            
        }
        while(i < nums1.length){
            arr.add(nums1[i++]);
        }
        while(j < nums2.length){
            arr.add(nums2[j++]);
        }
        // System.out.println(arr);
        int n = arr.size();
        if(n % 2 == 0){
            res = (arr.get(n / 2) + arr.get(n/2 - 1))/ 2.0;

        }
        else{
            res = arr.get(n / 2);
        }
        return res;
    }
}