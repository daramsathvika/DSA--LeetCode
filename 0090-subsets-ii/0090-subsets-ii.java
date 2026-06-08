class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> set = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        subDup(nums,0,set,list);
        return set;
    }
    public void subDup(int []nums,int i,List<List<Integer>> set,List<Integer> list){
        set.add(new ArrayList(list));
        for(int j=i;j<nums.length;j++){
            if(j>i&&nums[j]==nums[j-1]){continue;}
            list.add(nums[j]);
            subDup(nums,j+1,set,list);
            list.remove(list.size()-1);
            //subDup(nums,j+1,set,list);
        }
    }
}
// 1