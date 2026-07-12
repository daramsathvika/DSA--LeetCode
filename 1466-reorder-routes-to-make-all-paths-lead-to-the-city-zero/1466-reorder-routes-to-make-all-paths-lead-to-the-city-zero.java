class Solution {
    int ans;
    public int minReorder(int n, int[][] connections) {
        int i; boolean vis[] = new boolean[n];
        ArrayList<int[]> adjalist[]= new ArrayList[n];
        for(i=0;i<n;i++){adjalist[i]=new ArrayList<>();}
        for(i=0;i<n-1;i++){
            adjalist[connections[i][0]].add(new int[]{connections[i][1],1});
            adjalist[connections[i][1]].add(new int[]{connections[i][0],0});
        }
        vis[0]=true;
        dfs(adjalist,vis,0);
        return ans;
    }
    public void dfs(ArrayList<int[]> adjalist[],boolean[] vis,int i){
        //System.out.println();
        for(int p=0;p<adjalist[i].size();p++){
            int arr[]=adjalist[i].get(p);
            //System.out.print(arr[0]+" "+ans+" ");
            if(!vis[arr[0]]){
                vis[arr[0]]=true;ans+=arr[1];
                dfs(adjalist,vis,arr[0]);
            }
        }
    }
}