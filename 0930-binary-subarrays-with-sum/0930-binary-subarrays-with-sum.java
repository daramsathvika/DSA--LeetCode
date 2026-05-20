class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int i,j,n=nums.length,sum=0,count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(i=0;i<n;i++){
            sum+=nums[i];
            if(map.containsKey(sum-goal)){count+=map.getOrDefault(sum-goal,0);}
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}