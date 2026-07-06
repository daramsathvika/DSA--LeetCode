class Solution {
    public int findCircleNum(int[][] isConnected) {
        int ans=0;
        int n=isConnected.length;
        boolean visited[] = new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                ans++;
                visited[i]=true;
                dfs(isConnected,visited,i);
            }
        }
        return ans;
    }
    public static void dfs(int[][] isConnected,boolean[] visited,int i){
        for(int j=0;j<isConnected[i].length;j++){
            if(isConnected[i][j]==1&&visited[j]!=true){
                visited[j]=true;
                dfs(isConnected,visited,j);
            }

        }
    }
}