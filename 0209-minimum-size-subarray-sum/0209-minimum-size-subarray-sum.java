class Solution {
    public int minSubArrayLen(int k, int[] nums) {
        int i=0,sum=0,min_len=0,n=nums.length;
        for(i=0;i<n;i++){
            sum+=nums[i];
            if(nums[i]>=k){return 1;}
            if(sum>=k){min_len=i+1;break;}
        }
        if(i==n){return 0;}
        int left=0,right=i;
        while(left<=right&&right<n){
            sum-=nums[left++];
            if(sum>=k){min_len--;}
            else{
                if(right==n-1){break;}
                sum+=nums[++right];
            }
        }
        return min_len;
    }
}