class Solution {
    public int calPoints(String[] s) {
        Stack<Integer> st = new Stack<>();
        int i,n=s.length,top=0,sum=0;
        for(i=0;i<n;i++){
            if(st.size()>0){top=st.peek();}
            if(s[i].equals("+")){
                int peek=st.pop();
                int top2=st.peek();st.push(top);
                st.push(peek+top2);
            }
            else if(s[i].equals("D")){
                st.push(2*top);
            }
            else if(s[i].equals("C")){
                top=st.pop();
            }
            else{
                int x=Integer.parseInt(s[i]);st.push(x);}
        }
        while(st.size()>0){
            sum+=st.pop();
        }
        return sum;
    }
}