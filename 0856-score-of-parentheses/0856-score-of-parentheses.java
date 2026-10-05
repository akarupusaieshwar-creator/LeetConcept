class Solution {
    public int scoreOfParentheses(String s) {
        char pre = '(';
        int n = s.length();
        int res = 0;
        Stack<Character> st = new Stack<>();
        Stack<Integer> ans = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            int r = 0;
            if(ch == '('){
                st.push(ch);
                ans.push(0);
            }
            else{
                if(pre == '('){
                    ans.pop();
                    ans.push(1);
                }
                else{
                    while(ans.peek() != 0){
                        r += ans.pop();
                    }
                    ans.pop();
                    ans.push(r*2);
                }
                st.pop();
            }
            pre = ch;
        }
        while(!ans.isEmpty()) res += ans.pop();
        return res;
    }
}