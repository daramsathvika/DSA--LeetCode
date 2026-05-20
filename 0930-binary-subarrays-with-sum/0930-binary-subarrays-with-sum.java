class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int i,j,n=nums.length,sum=0,count=0;
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                sum+=nums[j];
                while(sum<=goal&&j<n){if(sum==goal){count++;}j++;if(j<n){sum+=nums[j];}}
                if(sum>goal){break;}
            }
            sum=0;
        }
        return count;
    }
}