class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n = s.length();
        int max = 0,j = 0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            while(val(map) && j <= i){
                char ch = s.charAt(j);
                if(map.get(ch) > 1){
                    map.put(ch,map.get(ch) - 1);
                }else{
                    map.remove(ch);
                }
                j++;
            }
                max = Math.max(max,i - j + 1);
                System.out.println(max+" || "+i+" || "+j);
        }
        return max;
    }
    public boolean val(HashMap<Character,Integer> map){
        for(char c : map.keySet()){
            if(map.get(c) > 2){
        return true;
            }
        }
                return false;
    }
}