class StockSpanner {
    Stack<int[]> span ;
    int count;

    public StockSpanner() {
        span=new Stack<>();
    }
        
    public int next(int price) {
        count=1;
        while(!span.isEmpty()&&span.peek()[0]<=price){
            count+=span.pop()[1];
        }
        span.push(new int[]{price,count});
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */