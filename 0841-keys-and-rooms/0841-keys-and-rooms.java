class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int i=0;
        boolean[] vis = new boolean[rooms.size()];
        vis[0]=true;
        dfs(rooms,0,vis);
        for(i=0;i<rooms.size();i++){
            if(!vis[i]){return false;}
        }
        return true;
    }
    public void dfs(List<List<Integer>> rooms,int i,boolean[] vis){
        for(int k:rooms.get(i)){
            if(!vis[k]){
                vis[k]=true;
                dfs(rooms,k,vis);
            }
        }
    }
}