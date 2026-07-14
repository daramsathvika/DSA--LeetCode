class Solution {
    int m,n,ans;
    public int numEnclaves(int[][] grid) {
        this.m=grid.length;n=grid[0].length;
        int i,j;
        boolean[][] vis = new boolean[m][n];
        for(i=0;i<m;i++){
            if(grid[i][0]==1){dfs(i,0,vis,grid,false);}
            vis[i][0]=true;
            if(grid[i][n-1]==1){dfs(i,n-1,vis,grid,false);}
            vis[i][n-1]=true;
        }
        for(j=1;j<n-1;j++){
            if(grid[0][j]==1){dfs(0,j,vis,grid,false);}
            vis[0][j]=true;
            if(grid[m-1][j]==1){dfs(m-1,j,vis,grid,false);}
            vis[m-1][j]=true;
        }
        for(i=1;i<m-1;i++){
            for(j=1;j<n-1;j++){
                if(!vis[i][j]&&grid[i][j]==1){
                    dfs(i,j,vis,grid,true);
                }
            }
        }
        return ans;
    }
    public void dfs(int i, int j,boolean[][] vis,int[][] grid,boolean count){
        if(i<0||i>m-1||j<0||j>n-1||vis[i][j]||grid[i][j]==0){return ;}
        else{
            vis[i][j]=true;if(count){ans++;}
            dfs(i-1,j,vis,grid,count);
            dfs(i+1,j,vis,grid,count);
            dfs(i,j-1,vis,grid,count);
            dfs(i,j+1,vis,grid,count);
        }
    }
    // public void dfs1(int i, int j,boolean[][] vis,int[][] grid){
    //     if(i<=0||i>=m-1||j<=0||j>=n-1||vis[i][j]||grid[i][j]==0){return;}
    //     else{
    //         vis[i][j]=true;
    //         count++;
    //         dfs1(i-1,j,vis,grid);
    //         dfs1(i+1,j,vis,grid);
    //         dfs1(i,j-1,vis,grid);
    //         dfs1(i,j+1,vis,grid);
    //     }
    // }
}