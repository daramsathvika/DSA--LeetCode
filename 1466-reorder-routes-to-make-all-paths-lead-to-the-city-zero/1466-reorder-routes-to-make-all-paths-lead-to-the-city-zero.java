class Solution {
    int ans;
    public int minReorder(int n, int[][] connections) {
        ArrayList<int[]> edjalist[] = new ArrayList[n];
        int i;
        HashSet<int[]> set = new HashSet<>();
        boolean vis[] = new boolean[n];
        for(i=0;i<n;i++){
            edjalist[i]=new ArrayList<int[]>();
        }
        for(i=0;i<n-1;i++){
            edjalist[connections[i][0]].add(connections[i]);
            edjalist[connections[i][1]].add(connections[i]);
        }
        Queue<Integer> q=new LinkedList<>();
        q.offer(0);vis[0]=true;
        while(!q.isEmpty()){
            int curr=q.poll();
            int size=edjalist[curr].size();
            for(i=0;i<size;i++){
                int[] edge= edjalist[curr].get(i);
                //int[] swapedge=new int[]{edge[1],edge[0]};
                if(edge[0]==curr&&!(set.contains(edge)/*||set.contains(swapedge)*/)){
                    set.add(edge);
                    //set.add(swapedge);
                    if(!vis[edge[1]]){
                        q.offer(edge[1]);
                        vis[edge[1]]=true;}ans++;}
                else{
                    set.add(edge);
                    if(!vis[edge[0]]){
                        q.offer(edge[0]);
                        vis[edge[0]]=true;}
                }
            }
        }
        return ans;
    }
}