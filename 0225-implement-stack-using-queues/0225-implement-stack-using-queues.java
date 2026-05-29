import java.util.*;
class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();
    this.q1=q1;
    this.q2=q2;        
    }
    
    public void push(int x) {
        while(q1.size()!=0){
            q2.add(q1.remove());
        }
        q1.add(x);
        while(q2.size()!=0){
            q1.add(q2.remove());
        }
    }
    
    public int pop() {
        return q1.remove();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */