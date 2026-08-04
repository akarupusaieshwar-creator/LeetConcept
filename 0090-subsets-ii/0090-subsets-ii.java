class Solution {
    List<List<Integer>> al ;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        al = new ArrayList<>();
        fun(nums,nums.length,0,new ArrayList<>());
        // Collections.sort(al,(a,b)->{
        //     int s = Math.min(a.size(),b.size());
        //     for(int i=0;i<s;i++){
        //         if(!a.get(i).equals(b.get(i))){
        //             return Integer.compare(a.get(i),b.get(i));
        //         }
        //     }
        //     return Integer.compare(a.size(),b.size());
        // });
        // Collections.sort(al,(a,b)->{
        //     int i=0;
        //     while(i < a.size() && i < b.size()){
        //         if(!a.get(i).equals(b.get(i))){
        //             return a.get(i) - b.get(i);
        //         }
        //         i++;
        //     }
        //     return a.size() - b.size();
        // });
        return al;
    }
    public void fun(int[] arr,int n,int idx,ArrayList<Integer> list){
        if(idx == n){
            // if(!al.contains(list)){
                al.add(new ArrayList<>(list));
            // }
            return;
        }
        list.add(arr[idx]);
        // Collections.sort(list);
        fun(arr,n,idx+1,list);

        list.remove(list.size()-1);
        while(idx < n - 1 && arr[idx] == arr[idx+1]){
            idx++;
        }
        fun(arr,n,idx+1,list);
    }
}