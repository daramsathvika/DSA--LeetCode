class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0,right=0,n=nums.length,sum=nums[left],len=0;
        if(n==1&&k>0||(n==1&&nums[0]==1)){return 1;}
        while(left<=right&&right<n-1){
            right++;
            sum+=nums[right];
            //if(len<right-left+1&&(sum+k>=right-left+1)){len=right-left+1;}
            if(sum+k<right-left+1){
                sum-=nums[left];
                left++;
            }
            if(len<right-left+1&&(sum+k>=right-left+1)){len=right-left+1;}
        }
        return len;
    }
}