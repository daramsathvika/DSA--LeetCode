class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> set = new ArrayList<>();
        List<Integer> list= new ArrayList<>();
        subset(set,list,0,nums);
        return set;
    }
    public void subset(List<List<Integer>> set,List<Integer> list,int i,int []nums){
        List<Integer> newlist = new ArrayList<>(list);
        if(i==nums.length){set.add(newlist);return;}
        newlist.add(Integer.valueOf(nums[i]));
        subset(set,newlist,i+1,nums);
        newlist.remove(Integer.valueOf(nums[i]));
        subset(set,newlist,i+1,nums);
    }
}