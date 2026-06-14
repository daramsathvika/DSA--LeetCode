class MyCircularQueue {
    int front;
    int rear;
    int[] arr;
    int k;
    public MyCircularQueue(int k) {
        int arr[] = new int[k];
        this.arr=arr;
        this.front=-1;
        this.rear=-1;
        this.k=k;
        Arrays.fill(arr,-1);
    }
    
    public boolean enQueue(int value) {
        if(front==-1){front++;}
        if(!isFull()){
            rear=(rear+1)%k;
            arr[rear]=value;
            return true;
        }
        else{return false;}        
    }
    
    public boolean deQueue() {
        if(!isEmpty()){
            arr[front]=-1;
            front=(front+1)%k;
            return true;
        }
        else{return false;}
    }
    
    public int Front() {
        if(isEmpty()){return -1;}
        return arr[front];
    }
    
    public int Rear() {
        if(isEmpty()){return -1;}
        return arr[rear];
    }
    
    public boolean isEmpty() {
        if(front==-1||rear==-1){return true;}
        for(int i:arr){if(i!=-1){return false;}}
        return true;
    }
    
    public boolean isFull() {
        for(int i:arr){if(i==-1){return false;}}
        return true;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */