class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i=0,n=nums.length;
        int arr[] = new int[2];
        for(i=0;i<n;i++){
            if(map.containsKey(target-nums[i])){arr[0]=map.get(target-nums[i])+1;arr[1]=i+1;return arr;}
            map.put(nums[i],i);
        }
        return arr;
    }
}