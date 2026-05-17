class Solution {
    public boolean containsDuplicate(int[] nums) {
        int i=0,j=i,n=nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(i=0;i<n;i++){
            set.add(nums[i]);
            if(set.size()<i+1){return true;}
        }
        return false;
    }
}