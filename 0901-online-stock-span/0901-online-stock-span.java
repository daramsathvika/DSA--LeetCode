class StockSpanner {
    Stack<Integer> st;
    Stack<Integer> span ;
    int i;
    int count;
    public StockSpanner() {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> span=new Stack<>();
        this.st=st;
        this.span =span;
        int i=0;
        this.i=i;
    }
        
    public int next(int price) {
        int count=1;this.count=count;
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