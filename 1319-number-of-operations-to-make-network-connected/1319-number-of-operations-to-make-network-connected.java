class Solution {
    int ans=-1;
    public int makeConnected(int n, int[][] connections) {
        int i;
        if(connections.length<n-1){return -1;}
        ArrayList<Integer> neighbours[]= new ArrayList[n];
        for(i=0;i<n;i++){neighbours[i]=new ArrayList<Integer>();}
        for(i=0;i<connections.length;i++){
            neighbours[connections[i][0]].add(connections[i][1]);
            neighbours[connections[i][1]].add(connections[i][0]);
        }
        boolean[] vis = new boolean[n];
        for(i=0;i<n;i++){
            if(!vis[i]){
                vis[i]=true;
                ++ans;
                //System.out.println(ans+" "+i); 
                dfs(vis,i,neighbours);}
        }
        return ans;
    }
    public void dfs(boolean[] vis,int i,ArrayList<Integer> neighbours[]){
        if(neighbours[i].isEmpty()){return;}
        for(int k:neighbours[i]){
            if(!vis[k]){
                vis[k]=true;
                dfs(vis,k,neighbours);
            }
        }
    }
}