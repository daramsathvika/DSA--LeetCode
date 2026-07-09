class Solution {
    int n;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.n=graph.length;
        List<List<Integer>> pathset = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(path,graph,0,pathset);
        return pathset;
    }
    public void dfs(List<Integer> path,int[][] graph,int pos,List<List<Integer>> pathset){
        path.add(pos);
        List<Integer> list=new ArrayList<>(path);
        if(pos==n-1){pathset.add(list);return ;}
        for(int i=0;i<graph[pos].length;i++){
            dfs(path,graph,graph[pos][i],pathset);
            path.remove(path.size()-1);
        }
    }
}