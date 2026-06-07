class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> set = new ArrayList<>();
        List<Integer> list= new ArrayList<>(k);
        combi(set,list,0,k,n);
        return set;
    }
    public void combi(List<List<Integer>> set,List<Integer> list,int i,int k,int n){
        if(list.size()==k){set.add(new ArrayList(list));}
        //if(list.size()==k&&)
        for(int j=i+1;j<=n;j++){
            if(list.contains(j)||(list.size()>0&&list.get(list.size()-1)>j)){continue;}
            list.add(j);
            combi(set,list,i+1,k,n);
            list.remove(Integer.valueOf(j));
        }
    }
}