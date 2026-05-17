class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0,n=nums.length;
        for(i=0;i<n;i++){
            if(map.containsKey(nums[i])){if((i-map.get(nums[i]))<=k){return true;}}
            map.put(nums[i],i);
        }
        return false;
    }
}