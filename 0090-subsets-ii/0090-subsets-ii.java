class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> set = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        subsetDup(set,list,0,nums);
        return set;
    }
    public void subsetDup(List<List<Integer>> set,List<Integer> list,int i,int[] nums){
        List<Integer> newlist = new ArrayList<>(list);
        if(i==nums.length){if(!set.contains(newlist)){set.add(newlist);} return ;}
        newlist.add(nums[i]);
        subsetDup(set,newlist,i+1,nums);
        newlist.remove(Integer.valueOf(nums[i]));
        subsetDup(set,newlist,i+1,nums);        
    }
}