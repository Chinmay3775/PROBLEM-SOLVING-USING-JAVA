class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<op.length;i++){
                if(op[i].equals("+")){
                    int n1=st.pop();
                    int n2=st.peek();
                    st.push(n1);
                    st.push(n1+n2);
                }
                else if(op[i].equals("D")){
                    st.push(2*st.peek());
                }
                else if(op[i].equals("C")){
                    st.pop();
                }
                else {
                    st.push(Integer.parseInt(op[i]));
                }
        }
        int sum=0;
        for(int i : st){
            sum+=i;
        }
        return sum;
    }
}
