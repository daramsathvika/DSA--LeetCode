class Solution {
    int m,n,c;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        m=image.length;n=image[0].length;
        this.m=m;this.n=n;this.c=image[sr][sc];
        if(c==color){return image;}
        Queue<int[]> q = new LinkedList<>();
        image[sr][sc]=color;
        q.offer(new int[]{sr,sc});
        int[] arr = new int[2];
        while(!q.isEmpty()){
            int size=q.size();
            for(int k=0;k<size;k++){
                arr=q.poll();
                int i=arr[0],j=arr[1];
                if(i>0&&image[i-1][j]==c){
                    image[i-1][j]=color;
                    q.offer(new int[]{i-1,j});}
                if(i<m-1&&image[i+1][j]==c){
                    image[i+1][j]=color;
                    q.offer(new int[]{i+1,j});} 
                if(j>0&&image[i][j-1]==c){
                    image[i][j-1]=color;
                    q.offer(new int[]{i,j-1});}
                if(j<n-1&&image[i][j+1]==c){
                    image[i][j+1]=color;
                    q.offer(new int[]{i,j+1});} 
            }
        }
        return image;
    }
}