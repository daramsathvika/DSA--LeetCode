class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());int num=0;
        for(int pile:piles){pq.add(pile);}
        while(k>0){
            int l=pq.poll();l=l/2+l%2;
            pq.offer(l);k--;
        }
        int sum=0;
        while(pq.size()>0){sum+=pq.poll();}
        return sum;
    }
}