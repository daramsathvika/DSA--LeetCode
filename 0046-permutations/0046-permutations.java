class Solution {
    public int n;
    public List<List<Integer>> permute(int[] nums) {
        this.n=nums.length;
        List<List<Integer>> set = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> listleft = new ArrayList<>();
        for(int x:nums){listleft.add(x);}
        permut(listleft,0,list,set);
        return set;
    }
    public void permut(List<Integer> listleft,int i,List<Integer> list,List<List<Integer>> set ){
        if(list.size()==n){set.add(new ArrayList(list));return;}
        List<Integer> newlistleft = new ArrayList<>(listleft);
        for(int j:newlistleft){
            //if(!list.contains(nums[j])){
            list.add(j);listleft.remove(Integer.valueOf(j));
            //}else{continue;}
            permut(listleft,j+1,list,set);
            list.remove(Integer.valueOf(j));listleft.add(j);
        }
    }
}