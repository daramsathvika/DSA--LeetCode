class Solution {
    public List<List<Integer>> combinationSum(int[] cand, int target) {
        Arrays.sort(cand);
        List<List<Integer>> set = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        combisum(cand,target,set,list,0,0);
        return set;
    }
    public void combisum(int []cand,int target,List<List<Integer>> set,List<Integer> list,int i,int sum){
        if(sum==target){set.add(new ArrayList(list));return;}
        for(int j=i;j<cand.length;j++){
            if(sum+cand[j]>target){return;}
            list.add(cand[j]);
            combisum(cand,target,set,list,j,sum+cand[j]);
            list.remove(Integer.valueOf(cand[j]));
        }
    }
}