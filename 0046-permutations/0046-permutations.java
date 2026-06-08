class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> set = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        permut(nums,0,list,set);
        return set;
    }
    public void permut(int[] nums,int i,List<Integer> list,List<List<Integer>> set ){
        if(list.size()==nums.length){set.add(new ArrayList(list));return;}
        for(int j=0;j<nums.length;j++){
            if(!list.contains(nums[j])){list.add(nums[j]);}
            else{continue;}
            permut(nums,j+1,list,set);
            list.remove(Integer.valueOf(nums[j]));
        }
    }
}