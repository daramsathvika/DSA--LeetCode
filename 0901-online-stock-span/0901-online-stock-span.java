class StockSpanner {
    Stack<Integer> st;
    Stack<Integer> span ;
    int i;
    int count;
    public StockSpanner() {
        st=new Stack<>();
        span=new Stack<>();
        int i=0;
    }
        
    public int next(int price) {
        count=1;
        if(st.isEmpty()||st.peek()>price){span.push(1);}
        else{
            while(!st.isEmpty()&&st.peek()<=price){
                st.pop();
                count+=span.pop();
            }
            span.push(count);
            //System.out.println(count);
        }
        st.push(price);
        i++;
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */