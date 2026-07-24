class KthLargest {
    int k;
    PriorityQueue<Integer> pq ;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.pq=new PriorityQueue<Integer>();
        for(int i:nums){
            if(pq.size()>=k&&i>pq.peek()){pq.poll();pq.add(i);}
            if(pq.size()<k){pq.add(i);}}
    }    
    public int add(int val) {
        if(pq.size()<k){pq.add(val);}
        else{if(val>pq.peek()){pq.poll();pq.add(val);}}
        int i=0,ans=-1;
        Stack<Integer> st = new Stack<>();
        while(st.size()>0){
            st.push(pq.poll());i++;
        }
        ans=pq.peek();
        while(!st.isEmpty()){pq.add(st.pop());}
        return ans;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */