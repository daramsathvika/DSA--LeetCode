class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i, n=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int arr[] = new int[2];Arrays.fill(arr,-1);
        for(i=0;i<n;i++){
            if(map.containsKey(target-nums[i])){arr[0]=map.get(target-nums[i]);arr[1]=i;return arr;}
            map.put(nums[i],i);
        }
        return arr;
    }
}