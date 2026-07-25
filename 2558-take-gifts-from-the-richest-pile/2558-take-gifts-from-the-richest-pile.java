class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());long ans=0;
        for(int i:gifts){pq.offer(i);}
        while(k>0){
            int p=pq.poll();
            p=(int)Math.sqrt(p);
            pq.offer(p);k--;}
        while(pq.size()>0){ans+=pq.poll();}
        return ans;
    }
}