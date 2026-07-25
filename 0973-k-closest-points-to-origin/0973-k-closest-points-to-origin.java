class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int i,n=points.length;
        HashMap<int[],Double> map = new HashMap<>();
        for(int[] point:points){
            double dist=Math.sqrt(point[0]*point[0]+point[1]*point[1]);
            map.put(point,dist);
        }
        Set<Double> set = new HashSet<>();
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int[] point:points){
            pq.offer(map.get(point));
            if(pq.size()>k){set.add(pq.poll());}
        }
        int[][] ans=new int[k][2];int p=0;
        for(int[] point:points){
            if(!set.contains(map.get(point))){ans[p++]=point;}
        }
        return ans;
    }
}