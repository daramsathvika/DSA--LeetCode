class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int key: map.keySet()){
            pq.offer(map.get(key));
            if(pq.size()>k){set.add(pq.poll());}
        }
        int arr[] = new int[k];int p=0;
        for(int key:map.keySet()){
            if(!set.contains(map.get(key))){arr[p++]=key;}
        }
        return arr;
    }
}