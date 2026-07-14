class Solution {
    int m,n;
    boolean isValid;
    public void solve(char[][] board) {
        this.m=board.length;this.n=board[0].length;
        int i,j;boolean vis[][]=new boolean[m][n];
        for(i=1;i<m-1;i++){
            for(j=1;j<n-1;j++){
                if(board[i][j]=='O'&&!vis[i][j]){
                    Queue<int []> q = new LinkedList<>();
                    vis[i][j]=true;q.offer(new int[]{i,j});
                    isValid=true;
                    dfs(board,vis,q,i,j);
                    if(isValid){
                        while(!q.isEmpty()){
                            int[] arr=q.poll();
                            board[arr[0]][arr[1]]='X';
                        }
                    }
                }
            }
        }
    }
    public void dfs(char[][] board,boolean vis[][],Queue<int []> q,int row,int col){
        int i=row,j=col;
        if(i<=0||i>=m-1||j<=0||j>=n-1){
            if(board[i][j]=='O'){vis[i][j]=true;isValid=false;}return;}
        if(i>0&&board[i-1][j]=='O'&&!vis[i-1][j]){
            q.offer(new int[]{i-1,j});vis[i-1][j]=true;
            dfs(board,vis,q,i-1,j);}
        if(i<m-1&&board[i+1][j]=='O'&&!vis[i+1][j]){
            q.offer(new int[]{i+1,j});vis[i+1][j]=true;
            dfs(board,vis,q,i+1,j);}
        if(j>0&&board[i][j-1]=='O'&&!vis[i][j-1]){
            q.offer(new int[]{i,j-1});vis[i][j-1]=true;
            dfs(board,vis,q,i,j-1);}
        if(j<n-1&&board[i][j+1]=='O'&&!vis[i][j+1]){
            q.offer(new int[]{i,j+1});vis[i][j+1]=true;
            dfs(board,vis,q,i,j+1);}         
    }
}