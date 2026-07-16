class Solution {
    int m,n;
    public int closedIsland(int[][] grid) {
        int i=0,j=0,ans=0;
        this.m=grid.length;this.n=grid[0].length;
        boolean[][] vis= new boolean[m][n];
        for(i=0;i<m;i++){
            if(grid[i][0]==0){dfs(vis,grid,i,0);}
            else{vis[i][0]=true;}
            if(grid[i][n-1]==0){dfs(vis,grid,i,n-1);}
            else{vis[i][n-1]=true;}
        }
        for(j=1;j<n-1;j++){
            if(grid[0][j]==0){dfs(vis,grid,0,j);}
            else{vis[0][j]=true;}
            if(grid[m-1][j]==0){dfs(vis,grid,m-1,j);}
            else{vis[m-1][j]=true;}
        }
        for(i=1;i<m-1;i++){
            for(j=1;j<n-1;j++){
                if(grid[i][j]==0){
                    ans++;
                    dfs(vis,grid,i,j);
                }
            }
        }
        return ans;
    }
    public void dfs(boolean[][] vis,int[][] grid,int i,int j){
        if(i<0||i>m-1||j<0||j>n-1||vis[i][j]||grid[i][j]==1){return ;}
        else{
            vis[i][j]=true;
            grid[i][j]=1;
            dfs(vis,grid,i-1,j);
            dfs(vis,grid,i+1,j);
            dfs(vis,grid,i,j-1);
            dfs(vis,grid,i,j+1);
        }
    }
}