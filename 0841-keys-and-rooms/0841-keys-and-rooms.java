class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int i=0;
        boolean[] vis = new boolean[rooms.size()];
        vis[0]=true;
        Queue<Integer> q = new LinkedList<>();
        for(int s:rooms.get(0)){
            q.offer(s);
        }   
        while(!q.isEmpty()){
            int size=q.size();
            for(i=0;i<size;i++){
                int p=q.poll();
                vis[p]=true;
                for(int j=0;j<rooms.get(p).size();j++){
                    if(!vis[rooms.get(p).get(j)]){q.offer(rooms.get(p).get(j));}
                }
            }
        } 
        for(i=0;i<rooms.size();i++){if(!vis[i]){return false;}}    
        return true;
    }
}