class Solution {
    public class frame{
        TreeSet<String> cur = new TreeSet<>();
        TreeSet<String> res = new TreeSet<>();
    }
    public List<String> braceExpansionII(String s) {
        Stack<frame> st = new Stack<>();
        st.push(new frame());
        for(char ch : s.toCharArray()){
            if(ch == '{'){
                st.push(new frame());
            }
            else if(ch == ','){
                frame f = st.peek();
                f.res.addAll(f.cur);
                f.cur.clear();
            }
            else if((ch == '}')){
                frame f = st.pop();
                f.res.addAll(f.cur);
                TreeSet<String> t = f.res;
                frame par = st.peek();
                par.cur = fun(par.cur,t);
            }
            else{
                frame f = st.peek();
                TreeSet<String> t = new TreeSet<>();
                t.add(String.valueOf(ch));
                f.cur = fun(f.cur,t);
            }
            
        }
        frame f = st.pop();
        f.res.addAll(f.cur);

        return new ArrayList<>(f.res);
    }
    public TreeSet<String> fun(TreeSet<String> s,TreeSet<String> t){
        if(s.isEmpty()) return new TreeSet<>(t);
        TreeSet<String> r = new TreeSet<>();
        for(String x : s){
            for(String y : t){
                r.add(x+y);
            }
        }
        return r;
    }
}