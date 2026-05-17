class Solution {
    public boolean containsDuplicate(int[] nums) {
        int i=0,j=i,n=nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(i=0;i<n;i++){
            if(!set.contains(nums[i])){set.add(nums[i]);}
            else{return true;}
        }
        return false;
    }
}