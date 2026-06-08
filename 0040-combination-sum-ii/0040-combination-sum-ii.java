class Solution {
    public List<List<Integer>> combinationSum2(int[] cand, int target) {
        List<List<Integer>> set = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(cand);
        combi2(set,list,target,0,cand);
        return set;
    }
    public void combi2(List<List<Integer>> set,List<Integer> list,int target,int i,int[] cand){
        if(target==0){set.add(List.copyOf(list));return;}
        for(int j=i;j<cand.length;j++){
            if(target<0){return;}
            if(j>i&&cand[j]==cand[j-1]){continue;}
            list.add(cand[j]);
            combi2(set,list,target-cand[j],j+1,cand);
            list.remove(list.size()-1);
        }
    }
}