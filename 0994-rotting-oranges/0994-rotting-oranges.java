class Solution {
    int ans=0,m,n;
    public int orangesRotting(int[][] grid) {
        m=grid.length;n=grid[0].length;int i,j;
        Queue<int[]> q = new LinkedList<>();
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
            }
        }
        bfs(grid,q);
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return ans;
    }
    public void bfs(int[][] grid,Queue<int[]> q){
        int arr[] = new int[2];
        while(!q.isEmpty()){
            int k = q.size();
            for(int p=0;p<k;p++){
                arr =q.poll();
                int i=arr[0],j=arr[1];
                int noones=0;
                if(i>0&&grid[i-1][j]==1){grid[i-1][j]=2;q.offer(new int[]{i-1,j});noones--;}
                if(i<m-1&&grid[i+1][j]==1){grid[i+1][j]=2;q.offer(new int[]{i+1,j});noones--;}
                if(j>0&&grid[i][j-1]==1){grid[i][j-1]=2;q.offer(new int[]{i,j-1});noones--;}
                if(j<n-1&&grid[i][j+1]==1){grid[i][j+1]=2;q.offer(new int[]{i,j+1});noones--;}
            }
            if(!q.isEmpty()){ans++;}
        }
    }
}