class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
        int res = n * 2;
        for(int i=0;i<reservedSeats.length;i++){
            map.computeIfAbsent(reservedSeats[i][0],k -> new HashSet<>()).add(reservedSeats[i][1]);
        }
        for(Set<Integer> i : map.values()){
            boolean left = !i.contains(2)&&!i.contains(3)&&!i.contains(4)&&!i.contains(5);
            boolean middle = !i.contains(4)&&!i.contains(5)&&!i.contains(6)&&!i.contains(7);
            boolean right = !i.contains(6)&&!i.contains(7)&&!i.contains(8)&&!i.contains(9);
            res -= 2;
            if(left && right){
                res += 2;
            }else if(left || right || middle){
                res += 1;
            }
            
        }
        return res;
    }
}