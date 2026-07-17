class Solution {
    int n;
    int color[];
    public boolean isBipartite(int[][] graph) {
        this.n=graph.length;int i,j,k;color = new int[n];
        Arrays.fill(color,-1);
        for(i=0;i<n;i++){
            if(color[i]==-1&&graph[i].length>0){
                color[i]=1;
                if(!dfs(graph,i,1)){//System.out.println(i);
                return false;}
            }
        }
        return true;
    }
    public boolean dfs(int[][] graph,int src,int c){
        for(int i=0;i<graph[src].length;i++){
            if(color[graph[src][i]]==-1){
                //System.out.println(graph[src][i]);
                color[graph[src][i]]=1-c;
                boolean isFalse=dfs(graph,graph[src][i],1-c);
                if(!isFalse){return false;}}
            else if(color[graph[src][i]]==c){
                //System.out.println("error at "+src +" "+ graph[src][i]+" "+color[graph[src][i]]);
                return false;}
            else{
                //System.out.println(graph[src][i]+" "+i+" already coloured "+color[graph[src][i]]);
                continue;}
        }
        return true;
    }
}