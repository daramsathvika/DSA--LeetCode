class Solution {
    int m,n,ans=0;
    public int numIslands(char[][] grid) {
        int i,j;m=grid.length;n=grid[0].length;
        boolean vis[][] = new boolean[m][n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(grid[i][j]=='1'&&!vis[i][j]){
                    ans++;
                    vis[i][j]=true;
                    dfs(grid,vis,i,j);
                }
            }
        }
        return ans;
    }
    public void dfs(char[][] grid,boolean[][] vis,int i,int j){
        if(i>0&&grid[i-1][j]=='1'&&!vis[i-1][j]){vis[i-1][j]=true;dfs(grid,vis,i-1,j);}
        if(i<m-1&&grid[i+1][j]=='1'&&!vis[i+1][j]){vis[i+1][j]=true;dfs(grid,vis,i+1,j);}
        if(j>0&&grid[i][j-1]=='1'&&!vis[i][j-1]){vis[i][j-1]=true;dfs(grid,vis,i,j-1);}
        if(j<n-1&&grid[i][j+1]=='1'&&!vis[i][j+1]){vis[i][j+1]=true;dfs(grid,vis,i,j+1);}
    }
}