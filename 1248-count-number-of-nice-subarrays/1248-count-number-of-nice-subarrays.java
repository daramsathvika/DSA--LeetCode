class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int i=0,n=nums.length,count=0,ans=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        while(i<n){
            if(nums[i]%2!=0){count++;}
            if(count>=k){ans+=map.getOrDefault(count-k,0);}
            map.put(count,map.getOrDefault(count,0)+1);
            i++;
        }
        return ans;
    }
}