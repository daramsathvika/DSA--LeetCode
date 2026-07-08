class Solution {
    int ans=0,m,n;
    public int maxAreaOfIsland(int[][] grid) {
        int i,j;this.m=grid.length;this.n=grid[0].length;
        boolean vis[][] = new boolean[m][n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(grid[i][j]==1){
                    vis[i][j]=true;
                    ans=Math.max(dfs(grid,i,j,1,vis),ans);
                    //System.out.println(ans+" "+dfs(grid,i,j,1,vis));
                }
            }
        }
        return ans;
    }
    public int dfs(int[][] grid,int i,int j,int count,boolean[][] vis){
        //if(i==0||i==m-1||j==0||j==n-1){return 1;}
        int a=0,b=0,c=0,d=0;
        if(i>0&&grid[i-1][j]==1&&!vis[i-1][j]){vis[i-1][j]=true;a=dfs(grid,i-1,j,count,vis);}
        if(i<m-1&&grid[i+1][j]==1&&!vis[i+1][j]){vis[i+1][j]=true;b=dfs(grid,i+1,j,count,vis);}
        if(j>0&&grid[i][j-1]==1&&!vis[i][j-1]){vis[i][j-1]=true;c=dfs(grid,i,j-1,count,vis);}
        if(j<n-1&&grid[i][j+1]==1&&!vis[i][j+1]){vis[i][j+1]=true;d=dfs(grid,i,j+1,count,vis);}
        return count+a+b+c+d;
    }
}