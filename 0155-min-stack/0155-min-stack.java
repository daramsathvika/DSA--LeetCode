class MinStack {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MinStack() {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2 = new Stack<>();      
        this.s1=s1;
        this.s2=s2;  
    }
    
    public void push(int val) {
        if(s1.size()==0||s2.size()==0){
            s1.push(val);s2.push(val);
        }
        else{s1.push(val);s2.push(Math.min(s2.peek(),val));}
    }
    
    public void pop() {
        s1.pop();s2.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return s2.peek();
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