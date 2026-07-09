class Solution {
    boolean ans;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer> graph[] = new ArrayList[n];
        if(source==destination){return true;}
        if(edges.length==0){return false;}
        boolean vis[] = new boolean[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<Integer>();
        }
        for(int i=0;i<edges.length;i++){
            //System.out.println(edges[i][0]+" "+edges[i][1]);
            graph[edges[i][0]].add(edges[i][1]);
            graph[edges[i][1]].add(edges[i][0]);
        }
        vis[source]=true;
        dfs(graph,source,destination,vis);
        return ans;
    }
    public void dfs(ArrayList<Integer>[] graph,int source,int destination,boolean[] vis){
        if(source==destination){ans=true;}
        for(int k:graph[source]){
            if(!vis[k]){
                vis[k]=true;
                dfs(graph,k,destination,vis);
            }
        }
    }
}