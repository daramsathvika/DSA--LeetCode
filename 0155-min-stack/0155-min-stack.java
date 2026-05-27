class MinStack {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public int min=Integer.MAX_VALUE;
    public MinStack() {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        this.s1=s1;
        this.s2=s2;
    }
    public void push(int val) {
        if(s1.size()==0){s2.push(val);}
        s1.push(val);
        s2.push(Math.min(val,s2.peek()));
        //System.out.println(s2.peek()+" "+min+" ");
    }
    public void pop() {
        s1.pop();s2.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        if(s2.size()>0){//System.out.println(s2.peek());
        return s2.peek();}
        else{return Integer.MIN_VALUE;}
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */