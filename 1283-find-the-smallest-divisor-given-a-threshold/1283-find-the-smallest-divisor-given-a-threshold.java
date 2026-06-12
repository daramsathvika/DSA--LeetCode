class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        long sum=0;
        int i,n=nums.length,min=1,max=0,ans=0,mid=0;
        for(i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }
        while(min<=max){
            mid=(min+max)/2;
            sum=0;
            for(i=0;i<n;i++){
                sum+=(nums[i]+mid-1)/mid;
                if(sum>threshold){break;}
            }
            if(sum<=threshold){ans=mid;max=mid-1;}
            else{min=mid+1;}
        }
        return ans;
    }
}