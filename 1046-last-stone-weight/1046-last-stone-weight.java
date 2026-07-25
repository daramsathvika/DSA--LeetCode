class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){pq.offer(i);}
        while(pq.size()>1){
            int h1=pq.poll(),h2=pq.poll();
            if(h1==h2){continue;}
            else{pq.offer(Math.abs(h1-h2));}
        }
        return pq.size()>0 ? pq.peek(): 0;
    }
}

