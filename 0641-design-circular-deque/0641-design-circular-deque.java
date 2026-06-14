class MyCircularDeque {
    int k;
    int front;
    int rear;
    int[] arr;
    int size;
    public MyCircularDeque(int k) {
        int arr[] = new int[k];
        this.arr= arr;this.k=k;this.size=0;
        int front = -1;int rear = -1;
        this.front = front;this.rear = rear;
    }
    
    public boolean insertFront(int value) {
        if(isFull()){return false;}
        else{
            size++;
            if(front==-1){front=0;rear=0;}
            else{front=(front+k-1)%k;}
            arr[front]=value;return true;}
    }
    
    public boolean insertLast(int value) {
        if(isFull()){return false;}
        else{
            size++;
            if(front==-1){front=0;}
            if(isEmpty()){rear=0;}
            else{rear=(rear+1)%k;}
            arr[rear]=value;return true;}
    }
    
    public boolean deleteFront() {
        if(isEmpty()){return false;}
        size--;
        front=(front+1)%k;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()){return false;}
        size--;
        rear=(rear-1+k)%k;
        return true;
    }
    
    public int getFront() {
        if(isEmpty()){return -1;}
        else{return arr[front];}
    }
    
    public int getRear() {
        if(isEmpty()){return -1;}
        else{return arr[rear];}
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==k;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */