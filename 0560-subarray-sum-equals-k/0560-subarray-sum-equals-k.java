class Solution {
    public int subarraySum(int[] nums, int k) {
        int i,n=nums.length,count=0;
        int sum[] = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        sum[0]=nums[0];
        for(i=0;i<n;i++){
            if(i>0){sum[i]=sum[i-1]+nums[i];}
            count+=map.getOrDefault(sum[i]-k,0);
            map.put(sum[i],map.getOrDefault(sum[i],0)+1);
        }
        return count;
    }
}