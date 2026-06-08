class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> set = new ArrayList<>();
        List<Integer> list= new ArrayList<>(k);
        //for(int i=0;i<n-k+1;i++){
        combi(set,list,1,k,n);//}
        return set;
    }
    public void combi(List<List<Integer>> set,List<Integer> list,int i,int k,int n){
        if(list.size()==k){set.add(new ArrayList(list));return;}
        for(int j=i;j<=n;j++){
            //if(list.contains(j)||(list.size()>0&&list.get(list.size()-1)>j)){continue;}
            list.add(j);
            combi(set,list,j+1,k,n);
            list.remove(list.size()-1);
        }
    }
}